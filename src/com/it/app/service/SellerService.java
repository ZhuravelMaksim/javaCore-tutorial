package com.it.app.service;


import com.it.app.domain.Seller;

public interface SellerService extends EmployeeService<Seller> {

    Seller getByCategory(Integer category);
}
