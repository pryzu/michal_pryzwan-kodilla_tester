package com.kodilla.abstracts.homework;

public abstract class Job {
    public int salary;
    public String responsibilities;
    public Job (int salary, String responsibilities){
        this.responsibilities = responsibilities;
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
    public String getResponsibilities (){
        return responsibilities;
    }
    public abstract class name();
    public abstract class age();
    
}
