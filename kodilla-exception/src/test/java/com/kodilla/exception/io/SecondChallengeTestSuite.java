package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

   @Test
   void testGivenFigureException() {
        //Given
       SecondChallenge secondChallenge = new SecondChallenge();
       double xFigure = 2;
       double yFigure = 1.5;

       //Then
       assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(xFigure, yFigure));
   }
}
