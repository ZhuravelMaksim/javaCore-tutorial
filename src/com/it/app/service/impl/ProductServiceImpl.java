package com.it.app.service.impl;

import com.it.app.dao.ProductDao;
import com.it.app.dao.impl.ProductDaoImpl;
import com.it.app.domain.Product;
import com.it.app.service.ProductService;

import java.util.Collection;
import java.util.List;


public class ProductServiceImpl implements ProductService {

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
    public Product sale(Integer count) {
        return null;
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
    public Collection<Product> getAll() {
        return productDao.getAll();
    }

    @Override
    public Product getByName(String name) {
        return null;
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
