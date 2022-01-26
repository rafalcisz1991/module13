package com.kodilla.good.patterns.challenges.zadanie135;

public class Application {

    public static void main(String[] args){

        Flight flight1 = new Flight("LAX", "Shiphol", "Okecie");
        Flight flight2 = new Flight("Modlin", "JFK", "Schonefeld");

        FlightSeeker flightSeeker = new FlightSeeker();
        flightSeeker.creatingFlightList(flight1);
        flightSeeker.creatingFlightList(flight2);

        flightSeeker.getFlightsFrom("LAX");


    }
}
