package com.kodilla.basic_assertion;

public class ResultChecker {
    public static boolean assertEquals (int actual, int expected){
        return actual == expected;

    }
    public static boolean assertEquals (double actual, double expected, double delta){
        return Math.abs(actual-expected)<=delta;
    }

}
