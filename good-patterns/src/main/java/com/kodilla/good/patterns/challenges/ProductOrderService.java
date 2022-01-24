package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    final InformingParties informingParties;
    final PurchaseService purchaseService;
    final PaymentExecution paymentExecution;

    public ProductOrderService(final InformingParties informingParties, final PurchaseService purchaseService,
                               final PaymentExecution paymentExecution) {
        this.informingParties = informingParties;
        this.purchaseService = purchaseService;
        this.paymentExecution = paymentExecution;
    }

    public void purchaseProcess(Seller seller, Buyer buyer, Product product, int quantity){
        boolean productAvailability = seller.getProductsInStock().containsKey(product);
        int quantityAvailability = seller.getProductsInStock().get(product);
        if (productAvailability && quantityAvailability >= quantity){
            System.out.println(product + " is available in " + seller + "'s stock. Put it in your cart");
            seller.sellingProducts(product, quantity);
            paymentExecution.executePayment(seller, buyer, product);
            purchaseService.createOrder(seller, buyer, product);
            informingParties.inform(seller, buyer);
        } else if (quantityAvailability < quantity) {
            System.out.println("Given product: " + product + " is currently out of stock. Requested quantity: "
                    + quantity + ", does not match  available quantity at Seller's stock: "
                    + quantityAvailability );

        } else {
            System.out.println("Seller does not have requested product in offer");
        }
    }
}


