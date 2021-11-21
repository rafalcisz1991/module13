package com.kodilla.testing.collections;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate (List < Integer > numbers) {
        List<Integer> roundNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                roundNumbers.add(i);
            } else {
               oddNumbers.add(i);
            }
        }
        return roundNumbers;
    }
}



