package com.kodilla.good.patterns.challenges.zadanie134;

public class Application {
    public static void main(String[] args){

        Company1 company1 = new Company1("comp1");
        Company2 company2 = new Company2("comp2");
        Products products1 = new Products("Fruits");
        Products products2 = new Products("Pastries");

        CompanyProcessor companyProcessor = new CompanyProcessor();

        companyProcessor.purchaseApp(company1, products1, 20);
        companyProcessor.purchaseApp(company2, products2, 40);
    }
}
