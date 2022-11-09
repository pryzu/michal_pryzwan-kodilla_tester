package com.example.kodillacollections.interfaces;

public class Circle implements  Shape{
    private double radius;

    public Circle (double radius){
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public double getPremiter() {
        return 2 * Math.PI * radius;
    }
}
