package com.kodilla.good.patterns.challenges.zadanie135;

import java.util.HashMap;

public class FlightSeeker {

    //Czy HashSet będzie odpowiedni do przechowywania kolekcji tras lotniczych?
    HashMap<Flight, Boolean> flightList = new HashMap<>();

    public HashMap<Flight, Boolean> creatingFlightList(Flight flight) {
        flightList.put(flight, true);
        return flightList;
    }

    public HashMap<Flight, Boolean> getFlightList() {
        return flightList;
    }

    public void getFlightsFrom(String departureAirport) {
        flightList.entrySet().stream()
                .map(entry -> entry.getKey().getDepartureAirport())
                .filter(airport -> airport.equals(departureAirport))
                .forEach(System.out::println);
    }

    public void getFlightsTo(String arrivalAirport) {
        flightList.entrySet().stream()
                .map(entry -> entry.getKey().getArrivalAirport())
                .filter(airport -> airport.equals(arrivalAirport))
                .forEach(System.out::println);
    }

    // o co chodzi z tym keySet() - podświetlona "map" na żółto poniżej
    public void getFlightsThrough(String stopoverAirport) {
        flightList.entrySet().stream()
                .map(entry -> entry.getKey().getStopoverAirport())
                .filter(airport -> airport.equals(stopoverAirport))
                .forEach(System.out::println);
    }
}




