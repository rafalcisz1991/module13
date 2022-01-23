package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.HashMap;

public class Buyer extends User {

    ArrayList<Product> purchasedProducts = new ArrayList<>();

    public Buyer(String name, String email) {
        super(name, email);
    }

    public ArrayList<Product> purchasingProducts (Product product){

        purchasedProducts.add(product);
        return purchasedProducts;
    }



}

