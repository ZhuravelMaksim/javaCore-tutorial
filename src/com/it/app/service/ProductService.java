package com.it.app.service;

import com.it.app.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService extends GenericService<Product> {

    List<Product> getByPrice(Double price);

    Optional<Product> sale(Integer count);
}
