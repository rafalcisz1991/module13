package com.kodilla.good.patterns.challenges.zadanie134;

public class OrderProcessor {

    public void purchaseOrder(Company company, Products products, int quantity){
        //1 metoda: zwrócić nazwę firmy
        System.out.println(company.getName());

        //2 metoda: pobranie info o zamówieniu
        company.process();

        //3 metoda - czy udało się zrealizować
        company.orderConfirmation(products, quantity);

    }
}
