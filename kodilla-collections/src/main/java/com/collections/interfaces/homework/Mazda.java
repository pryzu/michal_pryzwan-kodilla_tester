package com.example.kodillacollections.interfaces.homework;

public class Mazda implements Car {

    private int speed;

    public Mazda(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
    speed = speed +15;
    }

    @Override
    public void decreaseSpeed() {
    speed = speed - 10;
    }
}
