package Zadanie135;

import com.kodilla.good.patterns.challenges.zadanie135.Flight;
import com.kodilla.good.patterns.challenges.zadanie135.FlightSeeker;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class FlightSeekerTestSuite {

    @Test
    void testGetFlightsFrom() {
        //Given

        //When
        FlightSeeker flightSeeker = new FlightSeeker(testListOfFlights());
        List<Flight> searchedFlights = flightSeeker.getFlightsFrom("LAX");

        //Then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("LAX", "Shiphol", "Okecie"));
        assertEquals(expectedList, searchedFlights);
    }

    @Test
    void testGetFlightsTo() {
        //Given

        //When
        FlightSeeker flightSeeker = new FlightSeeker(testListOfFlights());
        List<Flight> searchedFlights = flightSeeker.getFlightsTo("Okecie");

        //Then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("LAX", "Shiphol", "Okecie"));
        assertEquals(expectedList, searchedFlights);
    }


    HashSet<Flight> testListOfFlights(){
        HashSet<Flight> listOfFlights = new HashSet<>();
        listOfFlights.add(new Flight("LAX", "Shiphol", "Okecie"));
        listOfFlights.add(new Flight("Modlin", "Schonefeld", "Heathrow"));
        return listOfFlights;
    }
}
