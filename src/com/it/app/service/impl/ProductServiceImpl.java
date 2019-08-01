package com.it.app.service.impl;

import com.it.app.dao.ProductDao;
import com.it.app.dao.impl.ProductDaoImpl;
import com.it.app.domain.Product;
import com.it.app.service.ProductService;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import static java.util.Optional.empty;


public class ProductServiceImpl implements ProductService {

    private static String path = "D:\\work\\product.txt";

    private static ProductService instance;

    private ProductDao productDao = ProductDaoImpl.getInstance();

    private ProductServiceImpl() {

    }

    public static ProductService getInstance() {
        if (instance == null) {
            instance = new ProductServiceImpl();
        }
        return instance;
    }

    @Override
    public List<Product> getByPrice(Double price) {
        return productDao.getByPrice(price);
    }

    @Override
    //TODO update method arguments
    public Optional<Product> sale(Integer count) {
        return empty();
    }

    @Override
    public Optional<Product> save(Product object) {
        return productDao.save(path, object);
    }

    @Override
    public Optional<Product> update(Product object) {
        return productDao.update(object);
    }

    @Override
    public Collection<Product> getAll() {
        return productDao.getAll();
    }

    @Override
    public Optional<Product> getByName(String name) {
        return productDao.getByName(name);
    }

    @Override
    public void delete(Product object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String name) {

    }
}
