package com.kodilla.testing.weather.stub;
import com.kodilla.testing.weather.stub.Temperatures;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }
    // moja metoda liczenia średniej

    public double calculateAverageTemperature() {

        double totalTemperature = 0;

        for (Map.Entry<String, Double> averageTemperatures : temperatures.getTemperatures().entrySet()) {
            totalTemperature += averageTemperatures.getValue();
        }

        double averageTemperature = totalTemperature / temperatures.getTemperatures().size();
        return averageTemperature;
    }

    // moja metoda wyznaczania mediany

    public double calculateMedianTemperature() {
        List<Double> temperatureList = new ArrayList<>();
        double medianTemperature;
        int middleValue;

        for (Map.Entry<String, Double> averageTemperatures : temperatures.getTemperatures().entrySet()) {

            temperatureList.add(averageTemperatures.getValue());
        }

        Collections.sort(temperatureList);

        if (temperatureList.size() % 2 == 0) {
            medianTemperature =(temperatureList.get(temperatureList.size() / 2) + (temperatureList.get(temperatureList.size() / 2) - 1)) / 2;
        } else {
            middleValue = ((temperatureList.size()) / 2);
            medianTemperature = temperatureList.get(middleValue);
        }
        return medianTemperature;
    }
}




