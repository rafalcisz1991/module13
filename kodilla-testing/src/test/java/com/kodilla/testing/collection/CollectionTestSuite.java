

package com.kodilla.testing.collection;

import com.kodilla.testing.collections.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollectionTestSuite {

    OddNumbersExterminator exterminator = new OddNumbersExterminator();


    @BeforeEach
    public void before(){
        System.out.println("Numbers test: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Numbers test: end");
    }

    @BeforeAll
    public static void beforeAll (){
        System.out.println("Collection Test Suite: begin");
    }

    @AfterAll
    public static void afterAll () {
        System.out.println("Collection Test Suite: end");
    }

    @DisplayName(
            "Even numbers, selected from an automatically created list of numbers (varying 0-10), " +
                    "will be compared to a manually created list of even numbers - ranger (varying 0-10)"
    )


    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> myList = new ArrayList<>();
        //When

        List<Integer> result = exterminator.exterminate(myList);


        //then
        Assertions.assertTrue(result.equals(new ArrayList<>()));


    }
    @Test
    void testOddNumbersExterminatorNullList() {

        //Given
        List<Integer> myList = null;
        //When

        List<Integer> result = exterminator.exterminate(myList);


        //then
        Assertions.assertTrue(result.equals(new ArrayList<>()));
    }

    @Test
    void testEvenNumbersExterminatorNormalList() {

        //Given
        List<Integer> myList = new ArrayList<>();

        for (int n = 0; n < 10; n++) {
            myList.add(n);
        }

        //When
        List<Integer> result = exterminator.exterminate(myList);

        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(0);
        expectedResult.add(2);
        expectedResult.add(4);
        expectedResult.add(6);
        expectedResult.add(8);


        //Then
        Assertions.assertTrue(result.equals(expectedResult));
    }
}
