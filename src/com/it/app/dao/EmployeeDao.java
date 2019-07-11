package com.it.app.dao;


import com.it.app.domain.Employee;

import java.util.Set;

public interface EmployeeDao<T extends Employee> extends GenericDao<T> {
    @Override
    Set<T> getAll();
}
