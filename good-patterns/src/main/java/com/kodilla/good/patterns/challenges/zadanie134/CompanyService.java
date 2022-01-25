package com.kodilla.good.patterns.challenges.zadanie134;

import java.util.HashMap;

public class CompanyService {

    CompaniesListing companiesListing = new CompaniesListing();
    ProductsListing productsListing = new ProductsListing();
    HashMap<Products, Integer> listOfProducts = new HashMap<>();

    public void companyProcess(Company company, Products products, int quantity){
        listOfProducts = productsListing.addingProducts(products, quantity);
        companiesListing.






    }
}
