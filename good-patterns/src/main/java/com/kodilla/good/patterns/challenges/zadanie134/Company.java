package com.kodilla.good.patterns.challenges.zadanie134;

import java.util.HashMap;
import java.util.Objects;

public abstract class Company {

    final String name;

    public Company(String name) {
        this.name = name;
    }

    abstract void process(Products products, int quantity);


    public String getName() {
        return name;
    }




}
