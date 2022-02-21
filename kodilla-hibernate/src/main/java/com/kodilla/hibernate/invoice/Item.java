package com.kodilla.hibernate.invoice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Item {

    private int id;
    private Product product;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;
    private List<Product> products = new ArrayList<>();

    public Item() {

    }

    public Item() {

    }
}
