package com.it.app.dao;


import com.it.app.domain.Seller;

public interface SellerDao extends EmployeeDao<Seller> {
    Seller getByCategory(Integer category);
}
