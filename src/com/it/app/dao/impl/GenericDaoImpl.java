package com.it.app.dao.impl;


import com.it.app.dao.GenericDao;
import com.it.app.domain.BaseEntity;
import com.it.app.util.impl.FileReader;
import com.it.app.util.impl.FileWriter;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.Function;

//TODO rename class and make it as util
public class GenericDaoImpl<T extends BaseEntity> implements GenericDao<T> {

    FileWriter<T> tFileWriter = new FileWriter<>();
    FileReader<T> tFileReader = new FileReader<>();

    @Override
    //TODO generate ID autoincrement
    public Optional<T> save(String path, T object) {
        //TODO
        //1. Add read from file
        final Collection<T> collection = tFileReader.read(path, objectTFunction);
        //2. check if exist by name
        //3. generate ID
        final Optional<Long> longOptional = collection.stream().map(t -> ((BaseEntity) t).getId()).max(Comparator.naturalOrder());
        final long id = longOptional.orElse(0L) + 1;
        //4. add to collection
        //collection.add
        //5. write collection to file
        tFileWriter.write(path, Collections.singletonList(object));
        return Optional.ofNullable(object);
    }

    @Override
    public Optional<T> update(T object) {
        return null;
    }

    @Override
    public Collection<T> getAll() {
        return null;
    }

    @Override
    public Optional<T> getByName(String Name) {
        return null;
    }

    @Override
    public void delete(T object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String Name) {

    }
}
