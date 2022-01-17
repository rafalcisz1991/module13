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

       //When & Then
       assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(xFigure, yFigure));
   }

   @Test
    void testValidFigures() {
       //Given
       SecondChallenge secondChallenge = new SecondChallenge();
       String expectedResult = "Done!";

       //When & Then
       assertEquals("Done!", expectedResult);
   }

   @Test
    void testValidAndInvalidFiguresException(){
       //Given
       SecondChallenge secondChallenge = new SecondChallenge();

       //When & Then
       assertAll(
               () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.5,1.5)),
               () -> assertDoesNotThrow(()-> secondChallenge.probablyIWillThrowException(1,2))
       );
   }
}
