package com.kodilla.good.patterns.challenges.zadanie134;

import java.util.HashMap;
import java.util.Objects;

public abstract class Company {

    final String name;
    final HashMap<Products, Integer> listOfProducts;

    public Company(String name, HashMap<Products, Integer> listOfProducts) {
        this.name = name;
        this.listOfProducts = listOfProducts;
    }

    abstract void process();
    abstract void orderConfirmation(Products products, int quantity);
    public String getName() {
        return name;
    }
}
