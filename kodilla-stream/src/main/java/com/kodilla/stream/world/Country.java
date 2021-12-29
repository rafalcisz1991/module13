package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {

    private final BigDecimal peopleQuantity;
    private final String name;

    public Country(final BigDecimal peopleQuantity, final String name){
        this.peopleQuantity = peopleQuantity;
        this.name = name;
    }

    public BigDecimal getPeopleQuantity(){
        return peopleQuantity;
    }

}
