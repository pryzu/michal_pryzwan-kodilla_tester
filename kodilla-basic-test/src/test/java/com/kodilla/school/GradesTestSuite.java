package com.kodilla.school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradesTestSuite {
    @Test
    public void shouldHaveZeroLength() {
        Grades grades = new Grades();
        int[] values = grades.getValues();
        assertEquals(0, values.length);
    }

    @Test
    public void shoulAddTwoElementsToArray() {
        Grades grades = new Grades();
        grades.add(4);
        grades.add(2);

        int[] values = grades.getValues();
        assertEquals(2, values.length);
        assertEquals(4, values[0]);
        assertEquals(2, values[1]);
    }

    @Test
    public void shouldCalculateAverage() {
        Grades grades = new Grades();
        grades.add(4);
        grades.add(2);
        grades.add(5);

        assertEquals(3.66, grades.getAverage(), 0.01);
    }

    @Test
    public void shouldReturnAverageEqualsZeroIsArrayIsEmpty() {
        Grades grades = new Grades();
        assertEquals(0, grades.getAverage(), 0.0001);
    }

    @Test
    public void shouldCalculateAveragesIfValuesAreOutsideRange() {
        Student student = new Student("Martin");
        student.addGeographyGrades(-2);
        student.addGeographyGrades(4);
        student.addGeographyGrades(8);

        student.addMathGrades(0);

        student.addPhyiscsGrades(19);
        student.addPhyiscsGrades(3);
        student.addPhyiscsGrades(3);

        double geographyAverage = student.getGeographyAverage();
        double mathAverage = student.getMathsAverage();
        double phyisicsAverage = student.getPhysicsAverage();
        double historyAverage = student.getHistoryAverage();

        assertEquals(4, geographyAverage, 0.01);
        assertEquals(0, mathAverage, 0.01);
        assertEquals(3, phyisicsAverage, 0.01);
        assertEquals(0, historyAverage, 0.01);
    }
    }


