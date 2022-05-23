package com.example.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCostAndDescription() {
        //Given

        //When
        PizzaOrder theOrder = new BasicPizzaOrder();

        //Then
        BigDecimal calculatedCost = theOrder.getCost();
        String description = theOrder.getDescription();
        assertEquals(new BigDecimal("15.00"), calculatedCost);
        assertEquals("Basic dough, tomato sauce, cheese", description);
    }

    @Test
    public void testHawaiiPizzaToppingsGetCostAndDescription() {
        //Given

        //When
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HawaiiToppingsPizzaOrderDecorator(theOrder);

        //Then
        BigDecimal theCost = theOrder.getCost();
        String description = theOrder.getDescription();
        assertEquals(new BigDecimal("20.00"), theCost);
        assertEquals("Basic dough, tomato sauce, cheese, pineapple", description);
    }

    @Test
    public void testHawaiiAndCheesePizzaToppingsGetCostAndDescription() {
        //Given

        //When
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HawaiiToppingsPizzaOrderDecorator(theOrder);
        theOrder = new CheeseToppingsPizzaOrderDecorator(theOrder);

        //Then
        BigDecimal theCost = theOrder.getCost();
        String description = theOrder.getDescription();
        assertEquals(new BigDecimal("30.00"), theCost);
        assertEquals("Basic dough, tomato sauce, cheese, pineapple, cheddar, mozzarella", description);
    }
}
