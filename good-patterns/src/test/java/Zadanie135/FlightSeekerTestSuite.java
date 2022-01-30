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
        FlightSeeker flightSeeker = new FlightSeeker();

        //When
        List<Flight> searchedFlights = flightSeeker.getFlightsFrom("LAX", testSetOfFlights());

        //Then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("LAX", "Shiphol", "Okecie"));
        assertEquals(expectedList, searchedFlights);
    }

    @Test
    void testGetFlightsTo() {
        //Given
        FlightSeeker flightSeeker = new FlightSeeker();

        //When
        List<Flight> searchedFlights = flightSeeker.getFlightsTo("Okecie", testSetOfFlights());

        //Then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("LAX", "Shiphol", "Okecie"));
        assertEquals(expectedList, searchedFlights);
    }

    @Test
    void testGetFlightsWithTransfer() {
        //Given
        FlightSeeker flightSeeker = new FlightSeeker();

        //When
        List<FlightWithTransfer> searchedFlights = flightSeeker.getFlightRoute("LAX", testSetOfTransferFlights());

        //Then
        List<String> stopoverAirports = new ArrayList<>();
        stopoverAirports.add("Okecie");
        stopoverAirports.add("Modlin");
        stopoverAirports.add("De Gaulle");
        List<FlightWithTransfer> expectedList = new ArrayList<>();
        expectedList.add(new FlightWithTransfer("LAX", stopoverAirports, "Schiphol"));
        assertEquals(expectedList, searchedFlights);
    }


    private HashSet<Flight> testSetOfFlights() {
        HashSet<Flight> listOfFlights = new HashSet<>();
        listOfFlights.add(new Flight("LAX", "Shiphol", "Okecie"));
        listOfFlights.add(new Flight("Modlin", "Schonefeld", "Heathrow"));
        return listOfFlights;
    }

    private HashSet<FlightWithTransfer> testSetOfTransferFlights() {
        List<String> transferAirports = new ArrayList<>();
        transferAirports.add("Okecie");
        transferAirports.add("Modlin");
        transferAirports.add("De Gaulle");
        FlightWithTransfer flightWithTransfer = new FlightWithTransfer("LAX",
                transferAirports, "Schiphol");

        HashSet<FlightWithTransfer> transferFlightsList = new HashSet<>();
        transferFlightsList.add(flightWithTransfer);
        return transferFlightsList;
    }
}
