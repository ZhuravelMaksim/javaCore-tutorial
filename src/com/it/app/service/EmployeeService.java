package com.it.app.service;


import com.it.app.domain.Employee;

import java.util.Set;

public interface EmployeeService<T extends Employee> extends GenericService<T> {

    boolean fire(T employee);

    boolean hire(T employee);

    boolean promote(T employee);

    @Override
    Set<T> getAll();
}
