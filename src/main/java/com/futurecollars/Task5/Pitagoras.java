package com.futurecollars.Task5;

public class Pitagoras {

    public static boolean pitagoras(int a, int b, int c) {

        if (a + b < c) {
            return false;
        } else {
            return a * a + b * b == c * c;
        }
    }
}
