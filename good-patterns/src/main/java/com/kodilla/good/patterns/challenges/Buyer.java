package com.kodilla.good.patterns.challenges;

import java.util.HashMap;

public class Buyer extends User {

    HashMap<Product, Integer> purchasedProducts;

    public Buyer(String name, String email) {
        super(name, email);
    }

    public HashMap<Product, Integer> purchasingProducts (Product product, Integer quantity){
        purchasedProducts.put(product, quantity);

        return purchasedProducts;
    }
}

