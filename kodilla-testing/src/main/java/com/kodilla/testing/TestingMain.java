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
        int a = 7;
        int b = 4;
        Calculator calculator = new Calculator(a,b);

        int addResult = calculator.getAddResult();

        if (addResult == (a + b)){
            System.out.println("Test of Calculator Class, adding given numbers: OK!");
        } else {
           System.out.println("Calculator class does add numbers correctly");
        }

        int subtractResult = calculator.getSubtractionResult();

        if (subtractResult == (a-b)) {
            System.out.println("Test of Calculator Class, subtracting given numbers: OK!");
        } else {
            System.out.println("Calculator class does not subtract numbers correctly");
        }
    }
}
