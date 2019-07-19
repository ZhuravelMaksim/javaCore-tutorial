package com.it.app.service;


import com.it.app.domain.Seller;

import java.util.Optional;

public interface SellerService extends EmployeeService<Seller> {

    Optional<Seller> getByCategory(Integer category);
}
