package com.kodilla.abstracts.homework;

public class Firefighter extends Jobs {
    public Firefighter (){
        super(900);
    }

    @Override
    public void name() {
        System.out.println("They name is Todd");
    }

    @Override
    public void age() {
        System.out.println("He is 40");
    }

    @Override
    public void job() {
        System.out.println("Todd is Firefighter");
    }

    @Override
    public void responsibilities() {
        System.out.println("Fitefighter duty is catch fire");
    }


}
