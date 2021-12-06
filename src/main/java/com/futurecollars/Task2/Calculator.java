package com.futurecollars.Task2;

public class Calculator {

    public Calculator(){
    }
    public double sum (double firstArg, double secondArg) {
        return firstArg + secondArg;
    }
    public double substract (double firstArg, double secondArg) {
        return firstArg - secondArg;
    }
    public double divide (double firstArg, double secondArg) {
        if(secondArg == 0) {
            throw new RuntimeException();
        }
        else {
            return firstArg / secondArg;
        }
    }
    public double multiply (double firstArg, double secondArg) {
        return firstArg * secondArg;
    }
}

