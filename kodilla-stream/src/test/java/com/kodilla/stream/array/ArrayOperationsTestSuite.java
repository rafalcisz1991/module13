package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage(){
        //Given
        int[] numbers = new int[5];
        numbers[0] = 4;
        numbers[1] = 10;
        numbers[2] = 21;
        numbers[3] = 13;
        numbers[4] = 100;

        //When
        double resultAverage = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(29.6, resultAverage);
    }
}
