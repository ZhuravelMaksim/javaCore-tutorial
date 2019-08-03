package com.it.app;

import com.it.app.domain.Heaver;
import com.it.app.domain.Product;
import com.it.app.domain.Seller;
import com.it.app.service.HeaverService;
import com.it.app.service.ProductService;
import com.it.app.service.SellerService;
import com.it.app.service.impl.HeaverServiceImpl;
import com.it.app.service.impl.ProductServiceImpl;
import com.it.app.service.impl.SellerServiceImpl;

public class Main {
    private final HeaverService heaverService;
    private final ProductService productService;
    private final SellerService sellerService;

    private Main() {
        this.heaverService = HeaverServiceImpl.getInstance();
        this.sellerService = SellerServiceImpl.getInstance();
        this.productService = ProductServiceImpl.getInstance();
    }

    public static void main(String[] args) {
        final Main main = new Main();
        main.heaverService.deleteAll();
        main.productService.deleteAll();
        main.sellerService.deleteAll();
        main.heaverService.save(new Heaver(1L, "Heaver", 25, 25, 25));
        main.heaverService.getAll().forEach(System.out::println);
        main.productService.save(new Product(1L, "Product", 100, 2.5));
        main.productService.getAll().forEach(System.out::println);
        main.sellerService.save(new Seller(1L, "Seller", 25, 100, 1));
        main.sellerService.getAll().forEach(System.out::println);
    }
}