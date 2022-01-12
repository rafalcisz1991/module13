package com.kodilla.stream.array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {

        /*int minValue = numbers
        int maxValue = num*/


        IntStream.range(1, 20)
                .sorted()
                .filter(w -> w % 2 == 0)
                .forEach(System.out::println);

        OptionalDouble myAverage = IntStream.range(numbers[0], numbers.length)
                .average();

        return myAverage.getAsDouble();
    }
}
