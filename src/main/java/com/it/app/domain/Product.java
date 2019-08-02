package com.it.app.domain;

import com.it.app.annotation.FileStorage;

@FileStorage(name = "Product")
public class Product extends BaseEntity {
    private String name;
    private String count;
    private Double price;

    public Product() {

    }

    public Product(Long id, String name, String count, Double price) {
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

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
