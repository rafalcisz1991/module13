package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final List<Country> myCountries = new ArrayList<>();
    private final String name;

    public Continent(final String name){
        this.name = name;
    }

    public void addCountry (Country country){
       myCountries.add(country);
    }

    public List getCountry(){
        return myCountries;
    }
}
