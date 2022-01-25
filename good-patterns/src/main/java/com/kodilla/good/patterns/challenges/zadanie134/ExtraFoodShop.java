package com.kodilla.good.patterns.challenges.zadanie134;

import java.util.HashMap;

public class ExtraFoodShop extends Company{
    public ExtraFoodShop(String name, String contact, HashMap<Products, Integer> productsForSale) {
        super(name, contact, productsForSale);
    }



    public void process() {
        System.out.println("Loading our current products in stock...");
    }
}
