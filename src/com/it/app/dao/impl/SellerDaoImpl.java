package com.it.app.dao.impl;

import com.it.app.dao.SellerDao;
import com.it.app.domain.Seller;

import java.util.HashSet;
import java.util.Set;

public class SellerDaoImpl implements SellerDao {

    private static SellerDao instance;

    private SellerDaoImpl() {

    }

    public static SellerDao getInstance() {
        if (instance == null) {
            instance = new SellerDaoImpl();
        }
        return instance;
    }

    @Override
    public Seller getByCategory(Integer category) {
        return null;
    }

    @Override
    public Seller save(Seller object) {
        return null;
    }

    @Override
    public Seller update(Seller object) {
        return null;
    }

    @Override
    public Set<Seller> getAll() {
        return new HashSet<>();
    }

    @Override
    public Seller getByName(String Name) {
        return null;
    }

    @Override
    public void delete(Seller object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String Name) {

    }
}
