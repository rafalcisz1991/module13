
package com.kodilla.testing.collections;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {

        if (numbers == null) {
            return new ArrayList<>();
        }

        List<Integer> evenNumbers = new ArrayList<>();

        for (Integer myList : numbers) {
            if (myList % 2 == 0) {
                evenNumbers.add(myList);
            }
        }
        return evenNumbers;
    }
}








