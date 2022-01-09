package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage(){
        //Given
        int numbers[] = new int[20];
        for(int i = 0; i < numbers.length; i++)
        numbers[i] = i + 1;

        //When
        double averageNumber = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(10, averageNumber);
    }
}
