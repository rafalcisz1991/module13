package com.kodilla.good.patterns.challenges.zadanie134;

import java.util.HashMap;

public class ExtraFoodShop extends Company{
    public ExtraFoodShop(String name, String contact) {
        super(name, contact);
    }

    HashMap<Products, Integer> productsList = new HashMap<>();

    public void process() {
        System.out.println("Loading our current products in stock...");
    }

    @Override
    HashMap<Products, Integer> listOfProducts(Products products, Integer quantity) {
        return productsList;
    }




}
