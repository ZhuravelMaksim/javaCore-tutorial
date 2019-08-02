package com.it.app.service;

import com.it.app.domain.Heaver;

import java.util.Optional;

public interface HeaverService extends EmployeeService<Heaver> {

    Optional<Heaver> getByBonus(Integer bonus);

}
