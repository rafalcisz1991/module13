package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSeeker {
    void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Schiphol", true);
        flightMap.put("LAX", true);
        flightMap.put("Schonefeld", true);
        flightMap.put("Okecie", true);

            if(flightMap.containsKey(flight.getArrivalAirport()) && flightMap.containsKey(flight.getDepartureAirport())){
                //drg if, sprawdzającym czy wartość jest true,
                System.out.println("Flight found!");
            } else {
                System.out.println("Flight not found!");
                throw new RouteNotFoundException();
            }
        }
    }

