package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSeeker {

    boolean findFlight(Flight flight) throws RouteNotFoundException {

        boolean flightMatch = false;

        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Schpiphol", true);
        flightMap.put("LAX", true);
        flightMap.put("Schonefeld", true);
        flightMap.put("Okecie", true);

        for (Map.Entry<String, Boolean> entry: flightMap.entrySet()){
            if(entry.getKey() != flight.getArrivalAirport() || entry.getKey() != flight.getDepartureAirport()){
                throw new RouteNotFoundException();
            } else {
                flightMatch = entry.getValue();
            }
        }
        return flightMatch;
    }
}
