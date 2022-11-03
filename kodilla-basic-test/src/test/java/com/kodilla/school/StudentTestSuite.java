package com.kodilla.school;

import org.junit.jupiter.api.Test;

public class StudentTestSuite {
    @Test
    public void shouldCalculateCorrectAveragesIfValuesAreInRange() {
    StudentTestSuite studnet = new Student ("Martin");
    studnet.addGeographyGrade (4);
    studnet.addGeographyGrade (4);
    studnet.addGeographyGrade (2);

    studnet.addHistoryGrade (1);
    studnet.addHistoryGrade (5);

        double geographyAverage = student.getGeographyAverage();
        double historyAverage = student.getHistoryAverage();
        double mathsAverage = student.getMathsAverage();
        double physicsAverage = student.getPhysicsAverage();

        assertEquals (3.33, geographyAverage, 0.01);
        assertEquals (3, historyAverage, 0.01);
        assertEquals (0, mathsAverage, 0.01);
        assertEquals (0, physicsAverage, 0.01);
    }
    }
}
