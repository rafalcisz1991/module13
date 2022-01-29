package com.kodilla.good.patterns.challenges.zadanie135;

import java.util.Objects;

public class Flight {

    final String departureAirport;
    final String stopoverAirport;
    final String arrivalAirport;

    public Flight(final String departureAirport, final String stopoverAirport, final String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.stopoverAirport = stopoverAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departureAirport, flight.departureAirport) && Objects.equals(stopoverAirport, flight.stopoverAirport) && Objects.equals(arrivalAirport, flight.arrivalAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureAirport, stopoverAirport, arrivalAirport);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departureAirport='" + departureAirport + '\'' +
                ", stopoverAirport='" + stopoverAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                '}';
    }
}
