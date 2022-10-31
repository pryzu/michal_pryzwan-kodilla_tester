package com.kodilla.inheritance;

public class Convertible extends Car {

    public void openRoof() {
        System.out.println("Opening roof...");
    }

    public void closedors() {
        System.out.println("Closing roof...");
    }

    @Override
    public void openDors(){
        System.out.println("Opening 2 dors");}
    public void turnOnLights() {
            System.out.println("Lights were turned on");
    }
    public Convertible(int wheels, int seats){
        super(wheels,seats);
        System.out.println("Convertible constructor");
    }
}
