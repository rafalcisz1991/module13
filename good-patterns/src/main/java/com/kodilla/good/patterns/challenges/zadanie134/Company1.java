package com.kodilla.good.patterns.challenges.zadanie134;

import java.util.HashMap;

public class Company1 extends Company {

    public Company1(String name, HashMap<Products, Integer> listOfProducts) {
        super(name, listOfProducts);
    }

    @Override
    void process() {
        System.out.println("Your order is being processed. In a while, you will receive confirmation, " +
                "whether we will be able to fulfill your order");
    }

    @Override
    void orderConfirmation(Products products, int quantity) {
        if(listOfProducts.containsKey(products) && listOfProducts.get(products) >= quantity){
            System.out.println("You placed your order successfully.");
        } else {
            System.out.println("We don't have given product in our stock");
        }
    }
}





