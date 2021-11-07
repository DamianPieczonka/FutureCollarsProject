package com.futurecollars.Task2;

public class Calculator {

    private static int counter;

    public Calculator(){
    }
    public double sum(double firstArg, double secondArg) {
        double result = firstArg + secondArg;
        System.out.println(result);
        counter++;
        return result;
    }
    public double substract(double firstArg, double secondArg) {
        double result = firstArg - secondArg;
        System.out.println(result);
        counter++;
        return result;
    }
    public double divide(double firstArg, double secondArg) {
        if(secondArg == 0) {
            System.out.println("Podaj wartość większą od zera");
            throw new RuntimeException();
        }
        else
        {
            double result = firstArg / secondArg;
            System.out.println(result);
            counter++;
            return result;
        }
    }
    public double multiply(double firstArg, double secondArg) {
        double result = firstArg * secondArg;
        System.out.println(result);
        counter++;
        return result;
    }

    public int getCounter() {
        return counter;
    }

}

