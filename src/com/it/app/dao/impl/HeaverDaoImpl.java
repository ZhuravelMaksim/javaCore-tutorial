package com.it.app.dao.impl;


import com.it.app.dao.HeaverDao;
import com.it.app.domain.Heaver;

import java.util.HashSet;
import java.util.Set;

public class HeaverDaoImpl implements HeaverDao {

    private static HeaverDao instance;

    private HeaverDaoImpl() {

    }

    public static HeaverDao getInstance() {
        if (instance == null) {
            instance = new HeaverDaoImpl();
        }
        return instance;
    }

    @Override
    public Heaver getByBonus(Integer bonus) {
        return null;
    }

    @Override
    public Heaver save(Heaver object) {
        return null;
    }

    @Override
    public Heaver update(Heaver object) {
        return null;
    }

    @Override
    public Set<Heaver> getAll() {
        return new HashSet<>();
    }

    @Override
    public Heaver getByName(String Name) {
        return null;
    }

    @Override
    public void delete(Heaver object) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteByName(String Name) {

    }
}
