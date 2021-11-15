package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error");
        }
        // my next Test

        Calculator calculator = new Calculator(7,4);

        int addResult = calculator.addingNumbers();

        if (addResult == 11){
            System.out.println("Test of Calculator Class, adding given numbers: OK!");
        } else {
           System.out.println("Calculator class does add numbers correctly");
        }

        int subtractResult = calculator.subtractingNumbers();

        if (subtractResult == 5) {
            System.out.println("Test of Calculator Class, subtracting given numbers: OK!");
        } else {
            System.out.println("Calculator class does not subtract numbers correctly");
        }
    }
}
