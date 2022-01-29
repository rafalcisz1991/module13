package com.kodilla.good.patterns.challenges.zadanie135;

import java.util.HashMap;

import java.util.HashSet;
import java.util.stream.Collectors;

public class FlightSeeker {

    HashSet<Flight> flightList = new HashSet<>();

    public HashSet<Flight> creatingFlightList(Flight flight) {
        flightList.add(flight);
        return flightList;
    }

    public HashSet<Flight> getFlightList() {
        return flightList;
    }

    //Poz -> Waw
    //Waw -> Monachium

    //Nowa, poprawiona wersja wersja
    public void getFlightsFrom(String departureAirport) {
        String searchedFlight = flightList.stream()
                .filter(airport -> airport.getDepartureAirport().equals(departureAirport))
                .map(Flight::toString)
                .collect(Collectors.joining());
        System.out.println(searchedFlight);
    }

  /*  public void getFlightsTo(String arrivalAirport) {
        flightList.entrySet().stream()
                .map(entry -> entry.getKey().getArrivalAirport())
                .filter(airport -> airport.equals(arrivalAirport))
                .forEach(System.out::println);
    }

    // o co chodzi z tym keySet() - podświetlona "map" na żółto poniżej
    public List<FlightWithTransfer> getFlightsThrough(String stopoverAirport) {
        flightList.entrySet().stream()
                .map(entry -> entry.getKey().getStopoverAirport())
                .filter(airport -> airport.equals(stopoverAirport))
                .forEach(System.out::println);

        
    }*/
}




