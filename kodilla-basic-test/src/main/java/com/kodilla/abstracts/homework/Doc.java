package com.kodilla.abstracts.homework;

public class Doc extends Jobs{
    public Doc(){
        super(2000);
    }

    @Override
    public void name() {
        System.out.println("They name is Julia");
    }

    @Override
    public void age() {
        System.out.println("She is 35");
    }

    @Override
    public void job() {
        System.out.println("Julia is a doctor");
    }

    @Override
    public String responsibilities() {
        return ("Doctor duty is healing humans");
    }
}
