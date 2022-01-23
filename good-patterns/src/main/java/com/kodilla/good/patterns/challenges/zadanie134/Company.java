package com.kodilla.good.patterns.challenges.zadanie134;

import java.util.ArrayList;

public abstract class Company {

    private String name;
    private String contact;
    private ArrayList<Products> productsForSale;

    abstract void process();

}
