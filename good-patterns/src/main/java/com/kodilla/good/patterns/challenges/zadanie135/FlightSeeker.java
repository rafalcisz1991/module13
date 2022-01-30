package com.kodilla.good.patterns.challenges.zadanie135;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSeeker {

    public List<Flight> getFlightsFrom(String departureAirport, HashSet<Flight> listOfFlights) {
        return listOfFlights.stream()
                .filter(airport -> airport.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> getFlightsTo(String arrivalAirport, HashSet<Flight> listOfFlights) {
        return listOfFlights.stream()
                .filter(airport -> airport.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());
    }

    public List<FlightWithTransfer> getFlightRoute(String soughtFlight, HashSet<FlightWithTransfer> transferFlights) {
        return transferFlights.stream()
                .filter(airport -> airport.getAllAirports().contains(soughtFlight))
                .collect(Collectors.toList());
    }
}





