package com.it.app.dao;

import com.it.app.domain.Product;

public interface ProductDao extends GenericDao {

    Product[] getByPrice(Double price);
}
