package com.kodilla.abstracts.homework;

public class Policeman extends Jobs {
    public Policeman(){
        super(1000);

    }

    @Override
    public void name() {
        System.out.println("They name is Jack");
    }

    @Override
    public void age() {
        System.out.println("He is 30");
    }

    @Override
    public void job() {
        System.out.println("Jack is a Policeman");
    }

    @Override
    public String responsibilities() {
        return  ("Policeman duty is protect people");
    }
}
