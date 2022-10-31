package com.kodilla.abstracts;

public abstract class Animal {
    public int numberOfLegs;
    public Animal(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;

    }

        public int getnumberOfLegs (){
            return numberOfLegs;
        }

    public abstract void giveVoice();

    }


