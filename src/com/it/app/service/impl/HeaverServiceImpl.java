package com.it.app.service.impl;

import com.it.app.dao.HeaverDao;
import com.it.app.dao.impl.HeaverDaoImpl;
import com.it.app.domain.Heaver;
import com.it.app.service.HeaverService;

import java.util.Optional;
import java.util.Set;


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
    public Optional<Heaver> getByBonus(Integer bonus) {
        return heaverDao.getByBonus(bonus);
    }

    @Override
    public boolean fire(Heaver employee) {
        //add some logic
        heaverDao.delete(employee);
        return true;
    }

    @Override
    public boolean hire(Heaver employee) {
        //add some logic
        //heaverDao.save(employee);
        return true;
    }

    @Override
    public boolean promote(Heaver employee) {
        //add some logic
        heaverDao.update(employee);
        return true;
    }

    @Override
    //TODO
    public Optional<Heaver> save(Heaver object) {
      //  return heaverDao.save(object);
        return null;
    }

    @Override
    public Optional<Heaver> update(Heaver object) {
        return heaverDao.update(object);
    }

    @Override
    public Set<Heaver> getAll() {
        return heaverDao.getAll();
    }

    @Override
    public Optional<Heaver> getByName(String name) {
        return heaverDao.getByName(name);
    }

    @Override
    public void delete(Heaver object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String name) {

    }
}
