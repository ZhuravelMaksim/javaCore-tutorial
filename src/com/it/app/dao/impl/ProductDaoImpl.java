package com.it.app.dao.impl;


import com.it.app.dao.ProductDao;
import com.it.app.domain.Product;

import java.util.ArrayList;
import java.util.List;

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
    public Product save(Product object) {
        return null;
    }

    @Override
    public Product update(Product object) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return new ArrayList<>();
    }

    @Override
    public Product getByName(String Name) {
        return null;
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
