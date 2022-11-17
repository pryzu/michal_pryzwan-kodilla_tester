package com.kodilla.collections.arrays;

import com.example.kodillacollections.interfaces.Circle;
import com.example.kodillacollections.interfaces.Shape;
import com.example.kodillacollections.interfaces.Square;
import com.example.kodillacollections.interfaces.Triangle;

public class ShapeUtils {
    public static void displayShapeInfo(Shape shape) {
        System.out.println("-----------------------------");
        System.out.println("Shape kind: " + getShapeName(shape));
        System.out.println("Shape area: " + shape.getArea());
        System.out.println("Shape perimeter: " + shape.getPerimeter());
    }

    private static String getShapeName(Shape shape) {
        if (shape instanceof Circle)
            return "Circle";
        else if (shape instanceof Triangle)
            return "Triangle";
        else if (shape instanceof Square)
            return "Square";
        else
            return "Unknown shape name";
    }
}