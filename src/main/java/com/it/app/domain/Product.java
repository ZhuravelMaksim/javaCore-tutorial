package com.it.app.domain;

import com.it.app.annotation.FileStorage;

@FileStorage(name = "Product")
public class Product extends BaseEntity {
    private String name;
    private Integer count;
    private Double price;

    public Product() {

    }

    public Product(Long id, String name, Integer count, Double price) {
        super(id);
        this.name = name;
        this.count = count;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", count='" + getCount() + '\'' +
                ", price=" + getPrice() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        if (count < 0) {
            throw new IllegalArgumentException("Count cannot be less than zero!");
        }
        this.count = count;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be less than zero!");
        }
        this.price = price;
    }
}
