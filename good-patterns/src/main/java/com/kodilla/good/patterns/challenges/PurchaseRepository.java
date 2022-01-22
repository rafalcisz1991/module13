package com.kodilla.good.patterns.challenges;

public interface PurchaseRepository {

    boolean createOrder(Seller seller, Buyer buyer, Product product);

}
