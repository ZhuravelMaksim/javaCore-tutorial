package com.it.app.dao;


import com.it.app.domain.Heaver;

public interface HeaverDao extends GenericDao{
    Heaver getByBonus(Integer bonus);
}
