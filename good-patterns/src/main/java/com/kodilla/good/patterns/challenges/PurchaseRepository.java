package com.kodilla.good.patterns.challenges;

import java.util.List;

public interface PurchaseRepository {

    List ordersList(Seller seller, Buyer buyer, Product product);
}
