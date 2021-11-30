package com.kodilla.testing.weather.stub;

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

    public int calculateAverageTemperature(){
        Map<String, Double> resultMap = new HashMap<>();

        int totalTemperature = 0;
        int amountOfReadings = resultMap.size();
        int averageTemperature = totalTemperature / amountOfReadings;

        for (Map.Entry<String, Double> averageTemperatures : temperatures.getTemperatures().entrySet()) {
            //calculating average temperature

            resultMap.put(averageTemperatures.getKey(), averageTemperatures.getValue());
            totalTemperature += averageTemperatures.getValue();
        }
        return averageTemperature;
    }

    // moja metoda wyznaczania mediany

    public int calculateMedianTemperature(){
        Map<String, Double> resultMap = new HashMap<>();
        List<Double> temperatureList = new ArrayList<>();
        int medianTemperature;

        for (Map.Entry<String, Double> averageTemperatures : temperatures.getTemperatures().entrySet()) {

            resultMap.put(averageTemperatures.getKey(), averageTemperatures.getValue());
            temperatureList.add(averageTemperatures.getValue());
        }

        temperatureList.sort(Comparator.naturalOrder());

    }
    return medianTemperature;
}




