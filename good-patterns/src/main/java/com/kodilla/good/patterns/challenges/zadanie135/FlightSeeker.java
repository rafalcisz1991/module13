package com.kodilla.good.patterns.challenges.zadanie135;

import java.util.HashMap;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSeeker {

    final HashSet<Flight> listOfFlights;

    public FlightSeeker(HashSet<Flight> listOfFlights) {
        this.listOfFlights = listOfFlights;
    }

    //Poz -> Waw
    //Waw -> Monachium

    //Nowa, poprawiona wersja wersja
    public List<Flight> getFlightsFrom(String departureAirport) {
        return listOfFlights.stream()
                .filter(airport -> airport.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());
    }

   public List<Flight> getFlightsTo(String arrivalAirport) {
       return listOfFlights.stream()
               .filter(airport -> airport.getArrivalAirport().equals(arrivalAirport))
               .collect(Collectors.toList());
    }

    /*

    // o co chodzi z tym keySet() - podświetlona "map" na żółto poniżej
    public List<FlightWithTransfer> getFlightsThrough(String stopoverAirport) {
        flightList.entrySet().stream()
                .map(entry -> entry.getKey().getStopoverAirport())
                .filter(airport -> airport.equals(stopoverAirport))
                .forEach(System.out::println);

        
    }*/
}




