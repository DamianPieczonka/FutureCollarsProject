package com.futurecollars.OOPTask4;

import java.util.Scanner;

public class Convert {
    public static void convertion (double minutes) {

        Scanner input = new Scanner(System.in);
        minutes = input.nextDouble();
        double seconds = minutes * 60;
        System.out.println("That equals: " + seconds + "seconds");

    }
}
