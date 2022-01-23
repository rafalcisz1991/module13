package com.kodilla.good.patterns.challenges;

public class InformerProcessor implements InformingParties{
    @Override
    public void inform(Seller seller, Buyer buyer) {
        System.out.println("Order confirmation will be sent to each party separately.");
    }
}
