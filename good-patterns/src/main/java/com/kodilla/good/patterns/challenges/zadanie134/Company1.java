package com.kodilla.good.patterns.challenges.zadanie134;

import java.util.HashMap;

public class Company1 extends Company {
    public Company1(String name) {
        super(name);
    }


    @Override
    void process(Products products, int quantity) {
        HashMap<Products, Integer> listOfProducts = new HashMap<>();
        listOfProducts.put(new Products("Fruits"), 20);
        listOfProducts.put(new Products("Vegetables"), 30);

        if (listOfProducts.containsKey(products)){
            System.out.println("Order may be filled");
        } else {
            System.out.println("Shop does not have given products in stock");
        }
    }

}


