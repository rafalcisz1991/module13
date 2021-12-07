package com.kodilla.testing.shape;

public class Square implements Shape {

    private String shapeName = "Square";
    private int shapeField = 40;

    public String getShapeName() {
        return shapeName;

    }

    public int getField() {
        return shapeField;

    }

    @Override
    public String toString() {
        return shapeName + shapeField;
    }

    public boolean equals(Object o) {
        Square e = (Square) o;
        return (shapeName.equals(e.getShapeName()) && (shapeField == getField()));
    }
}