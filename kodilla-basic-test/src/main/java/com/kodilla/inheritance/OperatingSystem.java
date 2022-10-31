package com.kodilla.inheritance;

public class OperatingSystem {
    private String turnOn;
    private String turnOff;
    public int publishingYear;

    public OperatingSystem(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public void turnOn() {
        System.out.println("Operating system is turned on");
    }

    public void setTurnOff() {
        System.out.println("Operating system is turn off.");
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void displayPublishingYear() {
        System.out.println("Publishing year:" + publishingYear);
    }
}