package com.kodilla.good.patterns.challenges.zadanie134;

import java.util.*;

public class CompaniesListing {

    HashSet<Company> companiesList = new HashSet<>();

    public HashSet<Company> addingCompanies(Company company){
        companiesList.add(company);
        return companiesList;
    }

    public HashSet<Company> removingCompanies(Company company) {
        companiesList.remove(company);
        return companiesList;
    }
}
