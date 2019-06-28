package com.it.app.service;

import com.it.app.domain.Heaver;

public interface HeaverService extends EmployeeService {

    Heaver getByBonus(Integer bonus);
}
