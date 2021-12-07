package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;


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
    public void beforeEveryTest() {
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
            Shape expectedResult = new Circle();

            //Then
            Assertions.assertTrue(expectedResult.equals(shapeCollector.getFigure(0)));

        }

        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Square());

            //When
            shapeCollector.removeFigure(new Square());
            int result = shapeCollector.getListSize();

            //Then
            Assertions.assertEquals(0, result);
        }



      /* @Test
        void testShowFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.
            //When
            shapeCollector.removeFigure(new Circle());
            shapeCollector.removeFigure(new Triangle());
            shapeCollector.removeFigure(new Square());
            //Then
            Assertions.assertEquals(0, shapeCollector.getFigure());

        }*/

    }
}









