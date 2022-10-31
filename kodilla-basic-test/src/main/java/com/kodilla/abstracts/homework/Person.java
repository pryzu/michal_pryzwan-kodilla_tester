package com.kodilla.abstracts.homework;

public class Person {
    public static void main(String[] args) {
        Firefighter firefighter = new Firefighter();
        Policeman policeman = new Policeman();
        Doc doc = new Doc();

        policeman.name();
        policeman.age();
        policeman.job();
        policeman.responsibilities();
        System.out.println("He earns " + policeman.getSalary());

        firefighter.name();
        firefighter.age();
        firefighter.job();
        firefighter.responsibilities();
        System.out.println("He earns " + firefighter.getSalary());

        doc.name();
        doc.age();
        doc.job();
        doc.responsibilities();
        System.out.println("He earns " + doc.getSalary());
    }
}
