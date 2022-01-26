package com.kodilla.good.patterns.challenges.zadanie135;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

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

    //Nowa, poprawiona wersja wersja
    public void getFlightsFrom(String departureAirport) {
        String searchedFlight = flightList.entrySet().stream()
                .map(Map.Entry::getKey)
                .filter(airport -> airport.getDepartureAirport().equals(departureAirport))
                .map(Flight::toString)
                .collect(Collectors.joining("; "));
        System.out.println(searchedFlight);


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




