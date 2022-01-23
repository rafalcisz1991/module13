package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformingParties informingParties;
    private PurchaseService purchaseService;
    private PaymentExecution paymentExecution;

    public ProductOrderService(final InformingParties informingParties, final PurchaseService purchaseService,
                               final PaymentExecution paymentExecution) {
        this.informingParties = informingParties;
        this.purchaseService = purchaseService;
        this.paymentExecution = paymentExecution;
    }

    public void purchaseProcess(Seller seller, Buyer buyer, Product product){
        boolean availability = seller.getProductsInStock().contains(product);
        if (availability){
            System.out.println(product + " is available in " + seller + "'s stock. Put it in your cart");
            buyer.purchasingProducts(product);
            seller.sellingProducts(product);
            paymentExecution.executePayment(seller, buyer, product);
            purchaseService.createOrder(seller, buyer, product);
            informingParties.inform(seller, buyer);
        } else {
            System.out.println("Given product: " + product + " is currently out of stock.");
        }
    }
}


