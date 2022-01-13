package com.kodilla.exception.test;

import java.util.stream.Stream;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        try  {
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("Error message: " + e);
        } finally {
            System.out.println("You must not divde by 0");
        }

        return a / b;
    }


    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3, 0);



        System.out.println(result);
    }
}
