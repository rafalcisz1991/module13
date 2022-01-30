
package com.kodilla.good.patterns.challenges.zadanie135;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class FlightWithTransfer {

    final String departureAirport;
    final List<String> transferAirports;
    final String arrivalAirport;

    public FlightWithTransfer(final String departureAirport, final List<String> transferAirports, final String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.transferAirports = transferAirports;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public List<String> getAllAirports() {
        List<String> allAirports = new ArrayList<>(transferAirports);
        allAirports.add(0, getDepartureAirport());
        allAirports.add(getArrivalAirport());
        return allAirports;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightWithTransfer that = (FlightWithTransfer) o;
        return Objects.equals(departureAirport, that.departureAirport) && Objects.equals(transferAirports, that.transferAirports) && Objects.equals(arrivalAirport, that.arrivalAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureAirport, transferAirports, arrivalAirport);
    }

    @Override
    public String toString() {
        return "FlightWithTransfer{" +
                "departureAirport='" + departureAirport + '\'' +
                ", transferAirports=" + transferAirports +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                '}';
    }
}





