package com.kodilla.good.patterns.challenges;

import java.util.HashMap;

public class Seller extends User{

    HashMap <Product, Integer> productsInStock;

    public Seller(String name, String email, HashMap<Product, Integer> productsInStock) {
        super(name, email);
        this.productsInStock = productsInStock;
    }
}




