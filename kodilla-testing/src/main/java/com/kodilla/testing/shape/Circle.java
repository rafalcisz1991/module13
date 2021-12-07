package com.kodilla.testing.shape;

public class Circle implements Shape{

    private String shapeName = "Circle";
    private int shapeField = 20;

    public String getShapeName() {
        return shapeName;

    }

    public int getField() {
        return shapeField;

    }
    @Override
    public String toString () {
        return shapeName + shapeField;
    }
}
