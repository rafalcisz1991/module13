package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double addResult = calculator.add(2, 2);
        double subResult = calculator.sub(4, 2);
        double mulResult = calculator.mul(2, 2);
        double divResult = calculator.div(4, 2);

        //Then
        assertEquals(4, addResult);
        assertEquals(2, subResult);
        assertEquals(4, mulResult);
        assertEquals(2, divResult);
    }
}


