package com.kodilla.abstracts.homework;

public class Square extends Shape{
    public Square(){
        super(5,5);
    }


    @Override
    public void surfaceArea() {
        System.out.println("Surface area of square is " + getWide() * getHeight());
    }

    @Override
    public void circuit() {
        System.out.println("Circuit of square is " + 2* getWide()+2* getHeight());
    }
}
