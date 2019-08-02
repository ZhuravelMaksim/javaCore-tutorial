package com.it.app.dao;


import java.util.Collection;
import java.util.Optional;

public interface GenericDao<T> {

    Optional<T> save(T object);

    Optional<T> update(T object);

    Collection<T> getAll();

    Optional<T> getById(Long id);

    void delete(T object);

    void deleteAll();

    void deleteById(Long id);
}
