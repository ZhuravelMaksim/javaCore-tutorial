package com.it.app.dao;


import com.it.app.domain.Heaver;

public interface HeaverDao extends EmployeeDao<Heaver> {
    Heaver getByBonus(Integer bonus);

}
