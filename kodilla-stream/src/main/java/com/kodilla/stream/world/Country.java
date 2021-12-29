package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {

    private final BigDecimal peopleQuantity;
    private final String name;

    public Country(final String name, final BigDecimal peopleQuantity){
        this.peopleQuantity = peopleQuantity;
        this.name = name;
    }

    public BigDecimal getPeopleQuantity(){
        return peopleQuantity;
    }

}
