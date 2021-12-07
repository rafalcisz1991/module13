
package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    public List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {

        shapes.add(shape);
    }

    public void removeFigure(Shape shape) {

        shapes.remove(shape);
    }

    public Shape getFigure(int n) {

        return shapes.get(n);
    }

    public int getListSize(){

        return shapes.size();
    }

    public String showFigures() {
        String myShapes = "Following shapes (and its fields) are: ";
        for (int i = 0; i < shapes.size(); i++ ){
            if (i < shapes.size() -1){
                myShapes = myShapes + (shapes.get(i)).getShapeName() + "(" + (shapes.get(i)).getField() + ")" + ", ";
            } else {
                myShapes = myShapes + (shapes.get(i)).getShapeName() + "(" + (shapes.get(i)).getField() + ")" + ".";
            }
        }
        return myShapes;
    }
}


