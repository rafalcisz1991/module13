
package com.kodilla.good.patterns.challenges.zadanie135;

import java.util.List;
import java.util.Objects;


public class FlightWithTransfer {

    final String departureAirport;
    List<String> transferAirports;
    final String arrivalAirport;

    public FlightWithTransfer(String departureAirport, List<String> transferAirports, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.transferAirports = transferAirports;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public List<String> getTransferAirports() {
        return transferAirports;
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





