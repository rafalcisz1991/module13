package com.kodilla.testing.calculator;

public class Calculator {

    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int addingNumbers() {
        int addResult = a + b;
        return addResult;
    }

    public int subtractingNumbers() {
        int subtractionResult = a - b;
        return subtractionResult;
    }

    public int getAddResult () {
        return addingNumbers();
    }

    public int getSubtractionResult(){
        return subtractingNumbers();
    }
}








