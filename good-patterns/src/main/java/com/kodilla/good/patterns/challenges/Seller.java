package com.kodilla.good.patterns.challenges;

import java.util.HashMap;

public class Seller extends User{

    public HashMap <Product, Integer> productsInStock;

    public Seller(String name, String email, HashMap<Product, Integer> productsInStock) {
        super(name, email);
        this.productsInStock = productsInStock;
    }

    public HashMap<Product, Integer> availableProducts (Product product, int quantity) {
        productsInStock.put(product, quantity);

        return productsInStock;
    }
}




