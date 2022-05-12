package com.example.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class HawaiiToppingsPizzaOrderDecorator extends AbstractPizzaOrderDecorator {
    public HawaiiToppingsPizzaOrderDecorator(PizzaOrder pizzaOrder) {super(pizzaOrder);}

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal("5.00"));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", pineapple";
    }
}
