package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.HashMap;

public class PurchaseApplication {

    public static void main(String[] args) {

        HashMap<Product, Integer> listOfProducts = new HashMap();
        listOfProducts.put(new Product("Coffee maker", "makes coffee", 29.99), 5);
        listOfProducts.put(new Product("iPhone", "makes calls", 149.99), 10);
        listOfProducts.put(new Product("Avengers action figure", "Hulk action figure", 19.99), 3);

        Seller seller1 = new Seller("seller1", "seller1@gmail.com", listOfProducts);
        Buyer buyer1 = new Buyer("buyer1", "buyer1@gmail.com");

        ProductOrderService productOrderService = new ProductOrderService( new InformerProcessor(),
                new PurchaseProcessor(), new PaymentExecutor());

        productOrderService.purchaseProcess(seller1, buyer1, new Product("Coffee maker",
                "makes coffee", 29.99), 10);
    }
}
