package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;

public class PurchaseApplication {

    public static void main(String[] args) {

        ArrayList<Product> listOfProducts = new ArrayList<>();
        listOfProducts.add(new Product("Coffee maker", "makes coffee", 29.99));
        listOfProducts.add(new Product("iPhone", "makes calls", 149.99));
        listOfProducts.add(new Product("Avengers action figure", "Hulk action figure", 19.99));

        Seller seller1 = new Seller("seller1", "seller1@gmail.com", listOfProducts);
        Buyer buyer1 = new Buyer("buyer1", "buyer1@gmail.com");

        PaymentExecutor paymentExecutor = new PaymentExecutor();
        PurchaseProcessor purchaseProcessor = new PurchaseProcessor();
        InformerProcessor informerProcessor = new InformerProcessor();

        ProductOrderService productOrderService = new ProductOrderService( new InformerProcessor(),
                new PurchaseProcessor(), new PaymentExecutor());

        productOrderService.purchaseProcess(seller1, buyer1, new Product("Coff maker",
                "makes coffee", 29.99));
    }
}
