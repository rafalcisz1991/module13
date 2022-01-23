package com.kodilla.good.patterns.challenges;

public class PaymentExecutor implements PaymentExecution {

    @Override
    public boolean executePayment(Seller seller, Buyer buyer, Product product) {
        System.out.println("Please choose most suitable payment option.");
        return false;
    }
}
