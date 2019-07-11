package com.it.app.service;

import com.it.app.domain.Product;

import java.util.List;

public interface ProductService extends GenericService<Product> {

    List<Product> getByPrice(Double price);

    Product sale(Integer count);
}
