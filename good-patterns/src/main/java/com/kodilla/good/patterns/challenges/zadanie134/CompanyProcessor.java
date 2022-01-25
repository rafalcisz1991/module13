package com.kodilla.good.patterns.challenges.zadanie134;

public class CompanyProcessor {

    public void purchaseApp(Company company, Products products, int quantity){
        if (company.getName().equals("comp1")){
            company.process(products, quantity);
        } else if (company.getName().equals("Comp2")){
            company.process(products, quantity);
        } else {
            System.out.println("No such shop at our service.");
        }
    }
}
