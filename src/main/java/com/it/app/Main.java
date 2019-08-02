package com.it.app;

import com.it.app.domain.Heaver;
import com.it.app.domain.Product;
import com.it.app.domain.Seller;
import com.it.app.service.impl.HeaverServiceImpl;
import com.it.app.service.impl.ProductServiceImpl;
import com.it.app.service.impl.SellerServiceImpl;

public class Main {
    public static void main(String[] args) {
        ProductServiceImpl.getInstance().save(new Product(1L, "OIL", "100", 2.0));
        HeaverServiceImpl.getInstance().save(new Heaver(1L, "Heaver", 1, 1, 1));
        SellerServiceImpl.getInstance().save(new Seller(1L, "Seller", 1, 1, 1));
    }
}