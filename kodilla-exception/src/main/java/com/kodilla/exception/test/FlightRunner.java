package com.kodilla.exception.test;

public class FlightRunner {

    public static void main(String[] args) throws RouteNotFoundException {

        FlightSeeker flightSeeker = new FlightSeeker();
        Flight flight1 = new Flight("Schiphol", "LAX");
        Flight flight2 = new Flight("Okecie", "JFK");

        try {
            flightSeeker.findFlight(flight1);
        } catch (RouteNotFoundException e){
            System.out.println("Flight not found");
        } finally {
            System.out.println("I am gonna be here... always!");
        }

    }

}
