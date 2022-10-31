package com.kodilla.abstracts.homework;

public class Triangle extends Shape{
    public Triangle (){ super(4, 8);
    }

    @Override
    public void surfaceArea() {
        System.out.println("Surface area of triangle is " + 1/2 * height + wide);
    }

    @Override
    public void circuit() {
        System.out.println("Circuit od triangle is " + 3* wide);

    }
}
