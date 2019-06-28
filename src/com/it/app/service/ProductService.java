package com.it.app.service;

import com.it.app.domain.Product;

public interface ProductService extends GenericService{

    Product[] getByPrice(Double price);

    Product sale(Integer count);
}
