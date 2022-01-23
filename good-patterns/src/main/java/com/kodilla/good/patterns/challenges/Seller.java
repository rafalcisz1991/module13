package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;

public class Seller extends User {

    ArrayList<Product> productsInStock;

    public Seller(String name, String email, ArrayList<Product> productsInStock) {
        super(name, email);
        this.productsInStock = productsInStock;
    }

    public ArrayList<Product> sellingProducts(Product product) {

        productsInStock.remove(product);
        return productsInStock;
    }

    public ArrayList<Product> getProductsInStock() {
        return productsInStock;
    }
}




