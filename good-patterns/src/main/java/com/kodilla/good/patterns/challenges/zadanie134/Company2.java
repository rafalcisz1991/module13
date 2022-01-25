package com.kodilla.good.patterns.challenges.zadanie134;

import java.util.HashMap;

public class Company2 extends Company{
    public Company2(String name) {
        super(name);
    }

    @Override
    void process(Products products, int quantity) {
        HashMap<Products, Integer> listOfProducts = new HashMap<>();
        listOfProducts.put(new Products("Dairy"), 10);
        listOfProducts.put(new Products("Pastries"), 40);
        if (listOfProducts.containsKey(products) && listOfProducts.get(products) >= quantity){
            System.out.println("Order may be filled");
        } else {
            System.out.println("Shop does not have given products in stock");
        }
    }
}
