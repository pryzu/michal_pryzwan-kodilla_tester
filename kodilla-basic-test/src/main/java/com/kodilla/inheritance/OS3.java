package com.kodilla.inheritance;

public class OP3 {

    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2010);
        operatingSystem.turnOn();
        OS2 os2 = new OS2(1995);
        os2.displayPublishingYear();
        System.out.println(os2.getPublishingYear());
    }}