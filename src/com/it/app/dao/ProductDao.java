package com.it.app.dao;

import com.it.app.domain.Product;

import java.util.List;

public interface ProductDao extends GenericDao<Product> {
    List<Product> getByPrice(Double price);
}
