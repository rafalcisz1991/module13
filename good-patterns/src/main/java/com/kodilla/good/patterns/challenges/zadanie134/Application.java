package com.kodilla.good.patterns.challenges.zadanie134;

import java.util.HashMap;

public class Application {
    public static void main(String[] args){

        HashMap<Products, Integer> newProducts = new HashMap<>();
        newProducts.put(new Products("Fruits"), 20);

        Company1 company1 = new Company1("comp1", newProducts);

        OrderProcessor companyProcessor = new OrderProcessor();

        companyProcessor.purchaseOrder(company1, new Products("Fruits"), 20);
    }
}
