package com.example.kodillacollections.interfaces.homework;

public class Opel implements Car {

    private int speed;

    public Opel(int speed) {

        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
    speed = speed + 5;
    }

    @Override
    public void decreaseSpeed() {
    speed = speed - 1;
    }
}