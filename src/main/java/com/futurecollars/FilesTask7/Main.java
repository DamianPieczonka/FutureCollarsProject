package com.futurecollars.FilesTask7;

public class Main {

    public static void main(String[] args) throws IllegalArgumentException {
        double number = -8;
        if (number < 0) {
            throw new IllegalArgumentException("Wrong value (must be 0 or above)");
        } else {
            System.out.println(Math.sqrt(number));
        }
    }
}

