package com.kodilla.abstracts.homework;

public abstract class Jobs {
    public int salary;

    public Jobs(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public abstract void name();

    public abstract void age();

    public abstract void job();

    public abstract void responsibilities();
}
