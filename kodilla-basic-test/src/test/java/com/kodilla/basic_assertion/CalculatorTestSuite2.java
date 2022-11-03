package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite2 {
    @Test
    public void testSubstract(){
        Calculator calculator1 = new Calculator();
        int a = 14;
        int b = 4;
        int substractResaul = calculator1.substract(a,b);
        assertEquals(10, substractResaul);
    }
}
