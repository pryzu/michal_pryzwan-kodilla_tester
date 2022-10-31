package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int x = 5;
        int y = 8;
        int sumResult = calculator.sum(x, y);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + x +" i " + y);
        } else {
            System.out.println("Metoda sum działa nie poprawnie dla liczb " + x +" i " +y);
        }

        Calculator calculator1 = new Calculator();
        int a = 14;
        int b = 4;
        int substractResult = calculator.substract(a, b);
        boolean correct2 = ResultChecker.assertEquals(11, 10);
        if (correct2){
            System.out.println("Metoda substract działa poprawnie dla liczb " + x + " i " + y);
        }else {
            System.out.println("Metoda substract nie działa poprawnie dla liczb " + x + " i " + y);
        }
        Calculator calculator2 = new Calculator();
        int c = 2;
        int d = 2;
        int compounding = calculator.compounding(c, d);
        Math.pow(2,2);
        System.out.println(c + " do potęgi "+ d + " równa się: "+ Math.pow(2,2));
    }
}
