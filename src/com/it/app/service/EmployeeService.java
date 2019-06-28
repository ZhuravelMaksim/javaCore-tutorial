package com.it.app.service;


import com.it.app.domain.Employee;

public interface EmployeeService extends GenericService {

    boolean fire(Employee employee);

    boolean hire(Employee employee);

    boolean promote(Employee employee);

}
