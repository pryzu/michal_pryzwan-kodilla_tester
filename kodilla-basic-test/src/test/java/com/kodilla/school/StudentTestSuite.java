package com.kodilla.school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTestSuite {
    @Test
    public void shouldCalculateCorrectAveragesIfValuesAreInRange() {
    Student student = new Student ("Martin");
    student.addGeographyGrades (4);
    student.addGeographyGrades (4);
    student.addGeographyGrades (2);

    student.addHistoryGrades (1);
    student.addHistoryGrades (5);

        double geographyAverage = student.getGeographyAverage();
        double historyAverage = student.getHistoryAverage();
        double mathsAverage = student.getMathsAverage();
        double physicsAverage = student.getPhysicsAverage();

        assertEquals (3.33, geographyAverage, 0.01);
        assertEquals (3, historyAverage, 0.01);
        assertEquals (0, mathsAverage, 0.01);
        assertEquals (0, physicsAverage, 0.01);
    }
    @Test
    public void averageShouldBeZeroIfStudentDontHaveGrades() {
        Student student = new Student("MArtin");
        assertEquals(0, student.getAverage(), 0.0001);
    }
    @Test
    public void shouldCalculateStudentAverage(){
        Student student = new Student("Martin");
        student.addGeographyGrades(4);
        student.addGeographyGrades(4);
        student.addGeographyGrades(2);
        student.addGeographyGrades(-2);
        student.addGeographyGrades(4);
        student.addGeographyGrades(8);

        student.addHistoryGrades(1);
        student.addHistoryGrades(5);

        student.addMathGrades(0);

        student.addPhyiscsGrades(19);
        student.addPhyiscsGrades(3);
        student.addPhyiscsGrades(3);

        assertEquals(2.375, student.getAverage(), 0.001);
    }
    }


