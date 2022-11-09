package com.example.kodillacollections.interfaces.homework;

public class Ford implements Car {
    private int speed;

    public Ford(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 10;
    }

    @Override
    public void decreaseSpeed() {
    speed = speed - 5;
    }
}