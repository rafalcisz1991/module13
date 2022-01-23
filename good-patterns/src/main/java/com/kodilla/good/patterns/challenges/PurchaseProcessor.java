package com.kodilla.good.patterns.challenges;

public class PurchaseProcessor implements PurchaseService{
    @Override
    public String createOrder(Seller seller, Buyer buyer, Product product) {
        return "Seperate order number will be generated";
    }
}
