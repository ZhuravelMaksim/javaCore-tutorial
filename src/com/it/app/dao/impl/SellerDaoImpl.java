package com.it.app.dao.impl;

import com.it.app.dao.SellerDao;
import com.it.app.domain.Seller;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static java.util.Optional.empty;

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
    public Optional<Seller> getByCategory(Integer category) {
        return empty();
    }

    @Override
    public Optional<Seller> save(Seller object) {
        return empty();
    }

    @Override
    public Optional<Seller> update(Seller object) {
        return empty();
    }

    @Override
    public Set<Seller> getAll() {
        return new HashSet<>();
    }

    @Override
    public Optional<Seller> getByName(String Name) {
        return empty();
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
