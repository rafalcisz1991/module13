package com.kodilla.good.patterns.challenges;

public class PurchaseProcessor implements PurchaseService{
    @Override
    public void createOrder(Seller seller, Buyer buyer, Product product) {
        System.out.println("Order number will be created");

    }
}
