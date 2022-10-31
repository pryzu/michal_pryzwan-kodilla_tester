package com.kodilla.inheritance;

public class Car {
    private final int wheels;
    private final int seats;
public Car(int wheels, int seats) {
    this.seats = seats;
    this.wheels = wheels;
}
    public void turnOnLights() {
        System.out.println("Lights were turned on");
    }
    public void openDors(){
        System.out.println("Opening 4 dors");
    }


    public int getSeats() {
        return seats;
    }

    public int getWheels() {
        return wheels;
    }
    public void displayNumberOfSeats() {
        System.out.println("Number of seats: " + seats);
    }
}

