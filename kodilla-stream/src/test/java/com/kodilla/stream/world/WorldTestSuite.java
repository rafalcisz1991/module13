package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity(){
        //Given
        //Creating new countries/continents
        //europe
        Country germany = new Country("Germany", new BigDecimal("80"));
        Country spain = new Country("Spain", new BigDecimal("50"));
        Continent europe = new Continent("Europe");
        europe.addCountry(germany);
        europe.addCountry(spain);
        //Asia
        Country china = new Country("China", new BigDecimal("100"));
        Country thailand = new Country("Thailand", new BigDecimal("1245"));
        Continent asia = new Continent("Asia");
        asia.addCountry(china);
        asia.addCountry(thailand);
        //Africa
        Country algeria = new Country("Algeria", new BigDecimal("1245"));
        Country tunisia = new Country("Tunisia", new BigDecimal("1245"));
        Continent africa = new Continent("Africa");
        africa.addCountry(algeria);
        africa.addCountry(tunisia);

        World newWorld = new World();
        newWorld.addContinent(europe);
        newWorld.addContinent(africa);
        newWorld.addContinent(asia);

        //When
        BigDecimal finalResultTotalNumberOfPeople = newWorld.getPeopleQuantity();

        //Then
        assertEquals(new BigDecimal("3965"), finalResultTotalNumberOfPeople);
    }
}
