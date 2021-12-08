package com.kodilla.testing.weather.stub;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeatherForecastTestSuite {

    @Test
    void testCalculateForecastWithSub(){
        //Given
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testCalculateAverageTemperature(){
        //Given
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecastAverage = new WeatherForecast(temperatures);

        //When
        double averageTemperature = weatherForecastAverage.calculateAverageTemperature();

        //Then
        Assertions.assertEquals(25.56, averageTemperature);
    }

    @Test
    void testCalculateMedianTemperature(){
        //Given
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecastMedian = new WeatherForecast(temperatures);

        //When
        double medianTemperature = weatherForecastMedian.calculateMedianTemperature();

        //Then
        Assertions.assertEquals(25.5, medianTemperature);
    }
}


