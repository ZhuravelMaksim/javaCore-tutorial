package com.it.app.dao;


import com.it.app.domain.Heaver;

import java.util.Optional;

public interface HeaverDao extends EmployeeDao<Heaver> {
    Optional<Heaver> getByBonus(Integer bonus);
}
