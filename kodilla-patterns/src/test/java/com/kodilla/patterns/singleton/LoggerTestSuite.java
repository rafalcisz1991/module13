package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void enterNewLogg() {
        logger = Logger.INSTANCE;
        logger.log("My logg");
    }

    @Test
    void testLastLog() {
        //Given
        //When
        String givenLog = logger.getLastLog();

        //Then
        assertEquals("My logg", givenLog);
    }

    @Test
    void testNewInputLog() {
        //Given
        logger.log("My new Logg");

        //When
        String myNewLogg = logger.getLastLog();

        //Then
        assertNotEquals("My logg", myNewLogg);
        assertEquals("My new Logg", myNewLogg);
    }
}
