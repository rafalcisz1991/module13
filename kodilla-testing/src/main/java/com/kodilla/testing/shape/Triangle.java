package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private String shapeName = "Triangle";
    private int shapeField = 55;

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
        Triangle e = (Triangle) o;
        return (shapeName.equals(e.getShapeName()) && (shapeField == getField()));
    }
}
