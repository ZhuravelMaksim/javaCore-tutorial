package com.it.app.dao.impl;


import com.it.app.dao.ProductDao;
import com.it.app.domain.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.util.Optional.empty;

public class ProductDaoImpl implements ProductDao {

    private static ProductDao instance;

    private ProductDaoImpl() {

    }

    public static ProductDao getInstance() {
        if (instance == null) {
            instance = new ProductDaoImpl();
        }
        return instance;
    }

    @Override
    public List<Product> getByPrice(Double price) {
        return new ArrayList<>();
    }

    @Override
    public Optional<Product> save(Product object) {
        return empty();
    }

    @Override
    public Optional<Product> update(Product object) {
        return empty();
    }

    @Override
    public List<Product> getAll() {
        return new ArrayList<>();
    }

    @Override
    public Optional<Product> getByName(String Name) {
        return empty();
    }

    @Override
    public void delete(Product object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String Name) {

    }
}
