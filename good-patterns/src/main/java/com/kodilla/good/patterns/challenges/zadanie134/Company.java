package com.kodilla.good.patterns.challenges.zadanie134;

import java.util.HashMap;
import java.util.Objects;

public abstract class Company {

    final String name;
    final String contact;
    final HashMap<Products, Integer> productsList = new HashMap<>();

    abstract void process();
    abstract HashMap<Products, Integer> listOfProducts (Products products, Integer quantity);

    public Company(String name, String contact) {
        this.name = name;
        this.contact = contact;

    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public HashMap<Products, Integer> getProductsForSale() {
        return productsList;
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
