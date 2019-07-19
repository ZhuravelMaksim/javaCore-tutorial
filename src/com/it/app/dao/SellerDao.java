package com.it.app.dao;


import com.it.app.domain.Seller;

import java.util.Optional;

public interface SellerDao extends EmployeeDao<Seller> {
    Optional<Seller> getByCategory(Integer category);
}
