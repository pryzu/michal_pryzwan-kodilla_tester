package com.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {
        Mazda mazda = new Mazda(30);
        Ford ford = new Ford(27);
        Opel opel = new Opel(25);

        doRace(mazda);
        doRace(ford);
        doRace(opel);
    }

    public static void doRace (Car car){
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();

        System.out.println(car.getSpeed());
    }

}