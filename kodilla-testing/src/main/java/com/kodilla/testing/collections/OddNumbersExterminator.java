package com.kodilla.testing.collections;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    List <Integer> myList = new ArrayList<>();
    for (int n = 0; n<50; n++){
        myList.add(n*2);

    }


    public List<Integer> exterminate (List < Integer > numbers) {

        List<Integer> roundNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        for (int i = 0; i < myList.size(); i++) {

            if ((myList.get(i)) % 2 == 0) {
                roundNumbers.add(i);
            } else {
               oddNumbers.add(i);
            }
        }
        return roundNumbers;
    }
}



