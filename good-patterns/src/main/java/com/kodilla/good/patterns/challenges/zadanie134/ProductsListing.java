package com.kodilla.good.patterns.challenges.zadanie134;

import java.util.HashMap;

public class ProductsListing implements ProductsForSale{

    final HashMap<Products, Integer> listOfProducts = new HashMap<>();
    @Override
    public HashMap<Products, Integer> addingProducts(Products products, Integer quantity) {
        listOfProducts.put(products, quantity);
        return listOfProducts;
    }
}
