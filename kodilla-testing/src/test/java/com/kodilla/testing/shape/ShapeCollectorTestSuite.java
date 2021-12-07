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
    @DisplayName("Tests for different shapes")
    class TestFigures {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Circle());

            //When
            Shape expectedResult = new Circle();

            //Then
            Assertions.assertEquals(expectedResult, shapeCollector.getFigure(0));

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
            shapeCollector.addFigure(new Triangle());
            shapeCollector.addFigure(new Circle());
            shapeCollector.addFigure(new Square());


            //When
           String result = shapeCollector.showFigures();
           String expectedResult ="Following shapes (and its fields) are: Triangle(55), Circle(20), Square(40).";

            //Then
           Assertions.assertTrue(result.equals(expectedResult));
        }

    }
}









