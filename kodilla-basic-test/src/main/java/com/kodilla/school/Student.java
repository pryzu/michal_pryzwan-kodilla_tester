package com.kodilla.school;

public class Student {
    private String name;
    private Grades maths;
    private Grades physics;
    private Grades geography;
    private Grades history;

    public Student (String name){
        this.name = name;
        this.maths = new Grades();
        this.physics = new Grades();
        this.geography = new Grades();
        this.history = new Grades();
    }
    public void addMathGrades (int grades){
        if (grades > 0 && grades < 7){
        this.maths.add(grades);
    }
}
public void addPhyiscsGrades (int grades){
    if (grades> 0 && grades < 7){
    this.physics.add(grades);
    }
}
public void addGeographyGrades (int grades) {
    if (grades > 0 && grades < 7) {
        this.geography.add(grades);
    }
}
public void addHistoryGrades (int grades){
        if (grades > 0 && grades < 7){
            this.history.add(grades);
        }
}
public double getMathsAverage(){

        return this.maths.getAverage();
}
public double getPhysicsAverage(){

        return this.physics.getAverage();
}
public double getGeographyAverage(){

        return this.geography.getAverage();
}
public double getHistoryAverage(){

        return this.history.getAverage();
}
public double getAverage(){
        double sum = this.geography.getAverage() + this.history.getAverage() + this.maths.getAverage() + this.physics.getAverage();
    return sum/4;
}
}
