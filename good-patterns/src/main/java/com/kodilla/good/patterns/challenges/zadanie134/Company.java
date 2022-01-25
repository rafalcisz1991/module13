package com.kodilla.good.patterns.challenges.zadanie134;

import java.util.HashMap;
import java.util.Objects;

public abstract class Company {

    private String name;
    private String contact;
    private HashMap<Products, Integer> productsForSale;

    abstract void process();

    public Company(String name, String contact, HashMap<Products, Integer> productsForSale) {
        this.name = name;
        this.contact = contact;
        this.productsForSale = productsForSale;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public HashMap<Products, Integer> getProductsForSale() {
        return productsForSale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) && Objects.equals(contact, company.contact) && Objects.equals(productsForSale, company.productsForSale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contact, productsForSale);
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
