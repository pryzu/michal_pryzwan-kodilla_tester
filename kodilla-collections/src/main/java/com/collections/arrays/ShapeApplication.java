package com.kodillacollections.arrays;

import com.example.kodillacollections.interfaces.Circle;
import com.example.kodillacollections.interfaces.Shape;
import com.example.kodillacollections.interfaces.Square;
import com.example.kodillacollections.interfaces.Triangle;

import java.util.Random;

public class ShapeApplication {
    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        for (int n = 0; n < shapes.length; n++)
            shapes[n] = drawShape();
        for (Shape shape : shapes)
            com.kodilla.collections.arrays.ShapeUtils.displayShapeInfo(shape);
    }
    private static Shape drawShape() {
        Random random = new Random();
        int drawShapeKind = random.nextInt();
        double a = getRandomSize(random);
        if (drawShapeKind == 0)
            return new Circle(a);
        else if (drawShapeKind == 1)
            return new Square(a);
        else {
            double b = getRandomSize(random);
            double c = getRandomSize(random);
            return new Triangle(a, b, c);
        }
    }
    private static double getRandomSize(Random random){
            return random.nextDouble() * 100 +1;
    }
}

