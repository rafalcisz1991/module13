package com.example.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder{

    @Override
    public BigDecimal getCost() {
        return new BigDecimal("15.00");
    }

    @Override
    public String getDescription() {
        return new String("Basic dough, tomato sauce, cheese");
    }
}
