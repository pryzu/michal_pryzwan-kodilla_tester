package com.kodilla.inheritance;

    public class OS2 extends OperatingSystem{

        public void turnOn() {
            System.out.println("Operating system turn on");
        }
        public void turnOff() {
            System.out.println("Operating system turn off");
        }
        public void publishingYear(){
            System.out.println("System are publishing in...");
        }
        public OS2(int publishingYear){
        super (publishingYear);
            System.out.println("OS2 constructor");
        }
    }
