package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite3 {
    @Test
    public void testCompounding(){
        Calculator calculator2 = new Calculator();
        int c = 2;
        int d = 2;
        int compoundingResaul = calculator2.compounding(c,d);
        assertEquals(4.0, compoundingResaul, 6);

    }
}
