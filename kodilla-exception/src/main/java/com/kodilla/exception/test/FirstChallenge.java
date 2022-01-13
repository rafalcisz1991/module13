package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException  {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double myResult = 0;
        try {
            myResult = firstChallenge.divide(3,0);
        } catch (ArithmeticException e) {
            System.out.println("Error message: " + e);
            System.out.println("You must not divide by 0");
        } finally {
            System.out.println("Running finally");
        }
        System.out.println(myResult);
    }
}
