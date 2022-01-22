package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformingParties informingParties;
    private PurchaseService purchaseService;
    private PurchaseRepository purchaseRepository;

    public ProductOrderService(final InformingParties informingParties, final PurchaseService purchaseService, final PurchaseRepository purchaseRepository) {
        this.informingParties = informingParties;
        this.purchaseService = purchaseService;
        this.purchaseRepository = purchaseRepository;
    }

    public void purchaseProcess(Seller seller, Buyer buyer, Product product, boolean availability){
        if (availability){

        }

    }





    //jakie konkretnie interfejsy napisać
    //jakie pola dla tej klasy
    //repozytorium o tym, czy
    //stworzyć klasę Product - pola, cena, opis, właściwości, ilość
    //osobna klasa, która będzie miała listę obiektów Product;
    //dwie oddzieln klasy - dla kupującego i sprzedającego
    //metody powiadamiania SMS, że zlecenie jest realizowane
    //metoda sprawdza, czy produkt jest dostępny - potem powiadamia obie strony, że jest dostępny

}


