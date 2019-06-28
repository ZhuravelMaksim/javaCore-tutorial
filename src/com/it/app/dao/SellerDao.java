package com.it.app.dao;


import com.it.app.domain.Seller;

public interface SellerDao extends GenericDao {

    Seller getByCategory(Integer category);
}
