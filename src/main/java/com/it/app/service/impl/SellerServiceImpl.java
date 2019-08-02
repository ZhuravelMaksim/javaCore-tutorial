package com.it.app.service.impl;

import com.it.app.dao.SellerDao;
import com.it.app.dao.impl.SellerDaoImpl;
import com.it.app.domain.Seller;
import com.it.app.service.SellerService;

import java.util.Optional;
import java.util.Set;


public class SellerServiceImpl implements SellerService {

    private static SellerService instance;

    private SellerDao sellerDao = SellerDaoImpl.getInstance();

    private SellerServiceImpl() {

    }

    public static SellerService getInstance() {
        if (instance == null) {
            instance = new SellerServiceImpl();
        }
        return instance;
    }

    @Override
    public Optional<Seller> getByCategory(Integer category) {
        return sellerDao.getByCategory(category);
    }

    @Override
    //TODO
    public boolean fire(Seller employee) {
        return false;
    }

    @Override
    //TODO
    public boolean hire(Seller employee) {
        return false;
    }

    @Override
    //TODO
    public boolean promote(Seller employee) {
        return false;
    }

    @Override
    public Optional<Seller> save(Seller object) {
        return sellerDao.save(object);
    }

    @Override
    public Optional<Seller> update(Seller object) {
        return sellerDao.update(object);
    }

    @Override
    public Set<Seller> getAll() {
        return sellerDao.getAll();
    }

    @Override
    public Optional<Seller> getById(Long id) {
        return sellerDao.getById(id);
    }

    @Override
    public void delete(Seller object) {
        sellerDao.delete(object);
    }

    @Override
    public void deleteAll() {
        sellerDao.deleteAll();
    }

    @Override
    public void deleteById(Long id) {
        sellerDao.deleteById(id);
    }
}
