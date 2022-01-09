package com.kodilla.stream.array;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {

        IntStream.range(numbers[0], numbers.length)
                .forEach(System.out::println);

        OptionalDouble myAverage = IntStream.range(numbers[0], numbers.length)
                .average();

        return myAverage.getAsDouble();
    }
}
