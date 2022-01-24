package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.HashMap;

public class Seller extends User {

   HashMap<Product, Integer> productsInStock;

    public Seller(String name, String email, HashMap<Product, Integer> productsInStock) {
        super(name, email);
        this.productsInStock = productsInStock;
    }

    public HashMap<Product, Integer> sellingProducts(Product product, int quantity) {
        Integer oldQuantity = productsInStock.get(product);
        productsInStock.replace(product, oldQuantity, oldQuantity - quantity );
        return productsInStock;
    }

    public HashMap<Product, Integer> getProductsInStock() {
        return productsInStock;
    }
}




