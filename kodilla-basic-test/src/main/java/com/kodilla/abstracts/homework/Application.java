package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square square = new Square();
        square.circuit();
        square.surfaceArea();

        Triangle triangle = new Triangle();
        triangle.circuit();
        triangle.surfaceArea();
    }
}
