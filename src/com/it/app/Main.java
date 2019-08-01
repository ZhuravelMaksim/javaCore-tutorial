package com.it.app;

import com.it.app.domain.Product;
import com.it.app.service.impl.ProductServiceImpl;

public class Main {
    public static void main(String[] args) {
        ProductServiceImpl.getInstance().save(new Product(1L, "OIL", "100", 2.0));
    }
}