package com.it.app.dao.impl;


import com.it.app.dao.GenericDao;
import com.it.app.dao.util.impl.FileReader;
import com.it.app.dao.util.impl.FileWriter;
import com.it.app.domain.BaseEntity;

import java.util.*;
import java.util.function.Function;

import static java.util.stream.Collectors.toList;

public abstract class GenericDaoImpl<T extends BaseEntity> implements GenericDao<T> {

    final FileWriter<T> tFileWriter;
    final FileReader<T> tFileReader;
    final Function<Object, T> mapper;

    protected GenericDaoImpl(Class<T> typeParameterClass, Function<Object, T> mapper) {
        this.tFileWriter = new FileWriter<>(typeParameterClass);
        this.tFileReader = new FileReader<>(typeParameterClass);
        this.mapper = mapper;
    }

    @Override
    public Optional<T> save(T t) {
        final Collection<T> collection = tFileReader.read(mapper);
        t.setId(generateId(collection));
        collection.add(t);
        tFileWriter.write(collection);
        return Optional.of(t);
    }

    @Override
    public Optional<T> update(T t) {
        final Collection<T> collection = tFileReader.read(mapper);
        final List<T> list = getUpdatedList(t, collection);
        tFileWriter.write(list);
        return Optional.of(t);
    }

    @Override
    public Collection<T> getAll() {
        return tFileReader.read(mapper);
    }

    @Override
    public Optional<T> getById(Long id) {
        return tFileReader.read(mapper).stream()
                .filter((o) -> o.getId().equals(id))
                .findFirst();
    }

    @Override
    public void delete(T t) {
        final Collection<T> collection = tFileReader.read(mapper);
        final List<T> list = collection.stream()
                .filter((o) -> !(o.getId().equals(t.getId())))
                .collect(toList());
        tFileWriter.write(list);
    }

    @Override
    public void deleteAll() {
        tFileWriter.write(new ArrayList<>());
    }

    @Override
    public void deleteById(Long id) {
        final Collection<T> collection = tFileReader.read(mapper);
        final List<T> list = collection.stream()
                .filter((o) -> !(o.getId().equals(id)))
                .collect(toList());
        tFileWriter.write(list);
    }

    private Long generateId(Collection<T> collection) {
        final Optional<Long> longOptional = collection.stream()
                .map(BaseEntity::getId)
                .max(Comparator.naturalOrder());
        return longOptional.orElse(0L) + 1L;
    }

    private List<T> getUpdatedList(T t, Collection<T> collection) {
        final Optional<T> elementOptional = collection.stream()
                .filter((o) -> o.getId().equals(t.getId()))
                .findFirst();
        final T element = elementOptional.orElseThrow(() -> new RuntimeException("Cannot update a non-existing object!"));
        return collection.stream()
                .map(o -> o.getId().equals(element.getId()) ? element : o)
                .collect(toList());
    }
}
