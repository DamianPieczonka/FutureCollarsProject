package com.futurecollars.Task5;

public class Pitagoras {

    public static String pitagoras(int a, int b, int c) {

        if (a + b < c) {
            return "Triangle does not exist";
        } else {
            if (a * a + b * b == c * c) {
                return "Triangle is rectangular";
            } else {
                return "Triangle is not rectangular";
            }
        }

    }
}
