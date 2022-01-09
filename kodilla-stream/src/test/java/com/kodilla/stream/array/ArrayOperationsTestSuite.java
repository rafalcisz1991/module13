package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage(){
        //Given
        int numbers[] = new int[20];
        int sumResult = 0;
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            sumResult = sumResult + (i + 1);
        }
        double expectedAverage = sumResult / numbers.length;

        //When
        double resultAverage = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(expectedAverage, resultAverage);
    }
}
