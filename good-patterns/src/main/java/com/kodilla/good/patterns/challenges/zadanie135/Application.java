
package com.kodilla.good.patterns.challenges.zadanie135;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Application {

    public static void main(String[] args){

        FlightSeeker flightSeeker = new FlightSeeker();

        List<String> transferAirports = new ArrayList<>();
        transferAirports.add("Okecie");
        transferAirports.add("Modlin");
        transferAirports.add("De Gaulle");
        FlightWithTransfer flightWithTransfer = new FlightWithTransfer("LAX",
                transferAirports, "Schiphol");

        HashSet<FlightWithTransfer> transferFlightsList = new HashSet<>();
        transferFlightsList.add(flightWithTransfer);

        System.out.println("Flights below");
        System.out.println(flightSeeker.getFlightRoute("LAX", transferFlightsList));


        System.out.println("More flights below");
        System.out.println(flightWithTransfer.getAllAirports());


    }
}

