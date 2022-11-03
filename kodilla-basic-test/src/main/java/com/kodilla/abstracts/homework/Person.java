package com.kodilla.abstracts.homework;

public class Person {

    private String name;
    private int age;
    private Jobs job;

    public void showResponisbilities (){
        System.out.println(this.name + this.age + this.job.responsibilities());
    }

    public Person(String name, int age, Jobs job){
        this.name = name;
        this.age = age;
        this.job = job;
    }
    public static void main(String[] args) {
        Firefighter firefighter = new Firefighter();
        Policeman policeman = new Policeman();
        Doc doc = new Doc();

       Person person1 = new Person ("John", 30, policeman);
       person1.showResponisbilities();
    }
}
