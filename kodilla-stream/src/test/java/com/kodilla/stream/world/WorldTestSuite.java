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
        Country country1 = new Country("Germany", new BigDecimal("80"));
        Country country2 = new Country("Spain", new BigDecimal("50"));
        Continent continent1 = new Continent("Europe");
        continent1.addCountry(country1);
        continent1.addCountry(country2);


        Country country3 = new Country("China", new BigDecimal("100"));
        Country country4 = new Country("Thailand", new BigDecimal("1245"));
        Continent continent2 = new Continent("Asia");
        continent2.addCountry(country3);
        continent2.addCountry(country4);


        Country country5 = new Country("Algeria", new BigDecimal("1245"));
        Country country6 = new Country("Tunisia", new BigDecimal("1245"));
        Continent continent3 = new Continent("Africa");
        continent3.addCountry(country5);
        continent3.addCountry(country6);

        World newWorld = new World();
        newWorld.addContinent(continent1);
        newWorld.addContinent(continent2);
        newWorld.addContinent(continent3);


        //When
        BigDecimal totalNumberOfPeople = newWorld.getPeopleQuantity();

        //Then
        BigDecimal expectedNumberFoPeople = new BigDecimal("3965");
        assertEquals(expectedNumberFoPeople, totalNumberOfPeople);


    }
}
