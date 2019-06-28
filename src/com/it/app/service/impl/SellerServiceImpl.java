package com.it.app.service.impl;

import com.it.app.dao.SellerDao;
import com.it.app.dao.impl.SellerDaoImpl;
import com.it.app.domain.Employee;
import com.it.app.domain.Seller;
import com.it.app.service.SellerService;


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
    public boolean fire(Employee employee) {
        return false;
    }

    @Override
    public boolean hire(Employee employee) {
        return false;
    }

    @Override
    public boolean promote(Employee employee) {
        return false;
    }

    @Override
    public Object save(Object object) {
        return null;
    }

    @Override
    public Object update(Object object) {
        return null;
    }

    @Override
    public Object[] getAll() {
        return new Object[0];
    }

    @Override
    public Object getByName(String name) {
        return null;
    }

    @Override
    public void delete(Object object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String name) {

    }

    @Override
    public Seller getByCategory(Integer category) {
        return null;
    }
}
