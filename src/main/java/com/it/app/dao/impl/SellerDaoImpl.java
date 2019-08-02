package com.it.app.dao.impl;

import com.it.app.dao.SellerDao;
import com.it.app.domain.Seller;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static java.util.Optional.empty;

public class SellerDaoImpl extends GenericDaoImpl<Seller> implements SellerDao {

    private static SellerDao instance;

    private SellerDaoImpl() {
        super(Seller.class, (o) -> {
            Seller seller = null;
            if (o instanceof Seller) {
                seller = (Seller) o;
            }
            return seller;
        });
    }

    public static SellerDao getInstance() {
        if (instance == null) {
            instance = new SellerDaoImpl();
        }
        return instance;
    }

    @Override
    public Optional<Seller> getByCategory(Integer category) {
        return empty();
    }

    @Override
    public Set<Seller> getAll() {
        return new HashSet<>(super.getAll());
    }
}
