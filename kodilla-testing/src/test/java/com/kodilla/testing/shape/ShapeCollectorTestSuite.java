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
        System.out.println("All tests are finished");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test nr: " + testCounter);
    }
    @AfterEach
    public void afterEveryTest(){

        System.out.println("Test nr: " + testCounter + " executed correctly!");
    }

    @Nested
    @DisplayName("Tests for Square")
    class TestFigures {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle();
            shapeCollector.addFigure(circle);

            //When
            Shape expectedResult = circle;

            //Then
            Assertions.assertEquals(circle, shapeCollector.getFigure(0));

        }

        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square();
            shapeCollector.addFigure(square);

            //When
            shapeCollector.removeFigure(square);

            //Then
            Assertions.assertEquals(0, shapeCollector.getListSize());
        }


       @Test
        void testShowFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape triangle = new Triangle();
            shapeCollector.addFigure(triangle);

            //When
           String result = shapeCollector.showFigures();
           String expectedResult ="Triangle, 55";

            //Then
           Assertions.assertTrue(result.equals(expectedResult));
        }

    }
}









