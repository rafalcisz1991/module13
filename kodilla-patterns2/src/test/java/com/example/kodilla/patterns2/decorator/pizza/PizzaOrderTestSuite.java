package com.example.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal("15.00"), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Basic dough, tomato sauce, cheese", description);
    }

    @Test
    public void testHawaiiPizzaToppingsGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HawaiiToppingsPizzaOrderDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal("20.00"), theCost);
    }

    @Test
    public void testHawaiiPizzaToppingsGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HawaiiToppingsPizzaOrderDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Basic dough, tomato sauce, cheese, pineapple", description);
    }

    @Test
    public void testHawaiiAndCheesePizzaToppingsGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HawaiiToppingsPizzaOrderDecorator(theOrder);
        theOrder = new CheeseToppingsPizzaOrderDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal("30.00"), theCost);
    }

    @Test
    public void testHawaiiAndCheesePizzaToppingsGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HawaiiToppingsPizzaOrderDecorator(theOrder);
        theOrder = new CheeseToppingsPizzaOrderDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Basic dough, tomato sauce, cheese, pineapple, cheddar, mozzarella", description);
    }
}
