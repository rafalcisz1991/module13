package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> myContinents = new ArrayList<>();

    public void addContinent (Continent continent){
        myContinents.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        return myContinents.stream()
                .flatMap(continent-> continent.getCountry().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
