package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Display display;

    public double add(double a, double b) {
        System.out.println("Number:");
        display.displayValue(a);
        System.out.println("will be added to: ");
        display.displayValue(b);
        return a + b;
    }

    public double sub(double a, double b) {
        display.displayValue(a);
        display.displayValue(b);
        return a - b;
    }

    public double mul(double a, double b) {
        display.displayValue(a);
        display.displayValue(b);
        return a * b;
    }

    public double div(double a, double b) {
        display.displayValue(a);
        display.displayValue(b);
        return a / b;
    }
}
