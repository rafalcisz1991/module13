package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.zadanie135.FlightSeeker;
import com.kodilla.good.patterns.challenges.zadanie135.Flight;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class FlightSeekerTestSuite {

    @Test
    void testGetFlightsFrom() {
        //Given
        FlightSeeker flightSeeker = new FlightSeeker(testSetOfFlights());

        //When
        List<Flight> searchedFlights = flightSeeker.getFlightsFrom("LAX");

        //Then
        List<String> transferAirports = new ArrayList<>();
        transferAirports.add("Okecie");
        transferAirports.add("Modlin");
        transferAirports.add("De Gaulle");
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("LAX", transferAirports, "Schiphol"));
        assertEquals(expectedList, searchedFlights);
    }

    @Test
    void testGetFlightsTo() {
        //Given
        FlightSeeker flightSeeker = new FlightSeeker(testSetOfFlights());

        //When
        List<Flight> searchedFlights = flightSeeker.getFlightsTo("Schiphol");

        //Then
        List<String> transferAirports = new ArrayList<>();
        transferAirports.add("Okecie");
        transferAirports.add("Modlin");
        transferAirports.add("De Gaulle");
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("LAX", transferAirports, "Schiphol"));
        assertEquals(expectedList, searchedFlights);
    }

    @Test
    void testGetFlightsWithTransfer() {
        //Given
        FlightSeeker flightSeeker = new FlightSeeker(testSetOfFlights());

        //When
        List<Flight> searchedFlights = flightSeeker.getFlightRoute("LAX", "Modlin");

        //Then
        List<String> stopoverAirports = new ArrayList<>();
        stopoverAirports.add("Okecie");
        stopoverAirports.add("Modlin");
        stopoverAirports.add("De Gaulle");
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("LAX", stopoverAirports, "Schiphol"));
        assertEquals(expectedList, searchedFlights);
    }


    private HashSet<Flight> testSetOfFlights() {
        List<String> transferAirports = new ArrayList<>();
        transferAirports.add("Okecie");
        transferAirports.add("Modlin");
        transferAirports.add("De Gaulle");
        Flight flight = new Flight("LAX",
                transferAirports, "Schiphol");

        HashSet<Flight> transferFlightsList = new HashSet<>();
        transferFlightsList.add(flight);
        return transferFlightsList;
    }
}
