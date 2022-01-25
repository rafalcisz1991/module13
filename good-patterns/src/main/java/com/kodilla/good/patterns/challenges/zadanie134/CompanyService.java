package com.kodilla.good.patterns.challenges.zadanie134;

public class CompanyService {

    CompaniesListing companiesListing = new CompaniesListing();


    public void addingCompanyProcess(Company company, Products products, int quantity){
        company.addingProducts(products, quantity);
        companiesListing.addingCompanies(company);

    }
}
