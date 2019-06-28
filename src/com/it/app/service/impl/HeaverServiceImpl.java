package com.it.app.service.impl;

import com.it.app.dao.HeaverDao;
import com.it.app.dao.impl.HeaverDaoImpl;
import com.it.app.domain.Employee;
import com.it.app.domain.Heaver;
import com.it.app.service.HeaverService;


public class HeaverServiceImpl implements HeaverService {

    private static HeaverService instance;

    private HeaverDao heaverDao = HeaverDaoImpl.getInstance();

    private HeaverServiceImpl() {

    }

    public static HeaverService getInstance() {
        if (instance == null) {
            instance = new HeaverServiceImpl();
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
    public Heaver getByBonus(Integer bonus) {
        return null;
    }
}
