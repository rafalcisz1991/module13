package com.kodilla.good.patterns.challenges.zadanie135;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSeeker {

    final HashSet<Flight> flightSet;
    final HashSet<FlightWithTransfer> flightWithTransferSet;

    public FlightSeeker(final HashSet<Flight> flightSet, final HashSet<FlightWithTransfer> flightWithTransferSet) {
        this.flightSet = flightSet;
        this.flightWithTransferSet = flightWithTransferSet;
    }

    public List<Flight> getFlightsFrom(String departureAirport) {
        return flightSet.stream()
                .filter(airport -> airport.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> getFlightsTo(String arrivalAirport) {
        return flightSet.stream()
                .filter(airport -> airport.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());
    }

    public List<FlightWithTransfer> getFlightRoute(String departureAirport, String arrivalAirport) {

        return flightWithTransferSet.stream()
                .filter(airport -> airport.getAllAirports().contains(departureAirport) &&
                        airport.getAllAirports().contains(arrivalAirport) && (((airport.getAllAirports()).
                        indexOf(departureAirport)) < airport.getAllAirports().indexOf(arrivalAirport)))
                .collect(Collectors.toList());
    }
}





