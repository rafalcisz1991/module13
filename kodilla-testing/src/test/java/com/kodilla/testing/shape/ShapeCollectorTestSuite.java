


package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("TDD: Shape Collector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("Tests begin now.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("Tests are finished");
    }

    @BeforeEach
    public static void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test nr: " + testCounter);
    }

    @Nested
    @DisplayName("Tests for Square")
    class TestFigures {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            //When
            shapeCollector.addFigure(new Circle());
            shapeCollector.addFigure(new Triangle());
            shapeCollector.addFigure(new Square());
            //Then
            Assertions.assertEquals(3, shapeCollector.getFigure());

        }

        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Circle());
            //When
            boolean result = shapeCollector.removeFigure(new Circle());


            shapeCollector.removeFigure(new Triangle());
            shapeCollector.removeFigure(new Square());

            Then
            Assertions.assertTrue(result);

              }


       @Test
        void testGetShowFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            //When
            shapeCollector.removeFigure(new Circle());
            shapeCollector.removeFigure(new Triangle());
            shapeCollector.removeFigure(new Square());
            //Then
            Assertions.assertEquals(0, shapeCollector.getFigure());

        }
        }
    }
}









