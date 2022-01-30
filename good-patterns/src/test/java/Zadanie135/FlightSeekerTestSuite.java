package Zadanie135;

import com.kodilla.good.patterns.challenges.zadanie135.Flight;
import com.kodilla.good.patterns.challenges.zadanie135.FlightSeeker;
import com.kodilla.good.patterns.challenges.zadanie135.FlightWithTransfer;
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
        FlightSeeker flightSeeker = new FlightSeeker(testListOfFlights(), testListOfTransferFlights());
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
        FlightSeeker flightSeeker = new FlightSeeker(testListOfFlights(), testListOfTransferFlights());
        List<Flight> searchedFlights = flightSeeker.getFlightsTo("Okecie");

        //Then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("LAX", "Shiphol", "Okecie"));
        assertEquals(expectedList, searchedFlights);
    }

    @Test
    void testGetFlightsWithTransfer() {
        //Given


        //When

        //Then
    }


    private HashSet<Flight> testListOfFlights() {
        HashSet<Flight> listOfFlights = new HashSet<>();
        listOfFlights.add(new Flight("LAX", "Shiphol", "Okecie"));
        listOfFlights.add(new Flight("Modlin", "Schonefeld", "Heathrow"));
        return listOfFlights;
    }

    private HashSet<FlightWithTransfer> testListOfTransferFlights() {
        ArrayList<String> stopoverFlights1 = new ArrayList<>();
        stopoverFlights1.add("Orly");
        stopoverFlights1.add("Beauvais ");

        ArrayList<String> stopoverFlights2 = new ArrayList<>();
        stopoverFlights2.add("Le Bourget");
        stopoverFlights2.add("Gardermoen");

        HashSet<FlightWithTransfer> listOfFlights = new HashSet<>();
        listOfFlights.add(new FlightWithTransfer("Okecie", stopoverFlights1, "Modlin"));
        listOfFlights.add(new FlightWithTransfer("Okecie", stopoverFlights2, "Modlin"));
        return listOfFlights;
    }
}
