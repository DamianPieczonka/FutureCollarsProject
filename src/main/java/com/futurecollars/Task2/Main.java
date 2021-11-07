package com.futurecollars.Task2;
import java.util.Scanner;

public class Main{

public static void main(String[] args) {

            System.out.println("Input:");
            Scanner scanner = new Scanner(System.in);
            double firstArg = scanner.nextDouble();
            double secondArg = scanner.nextDouble();

            char operation = scanner.next().charAt(0);

            Calculator nonStaticCalculator = new Calculator();

            System.out.println(nonStaticCalculator.getCounter());

            switch (operation) {
                case '+': nonStaticCalculator.sum(firstArg, secondArg); break;
                case '-': nonStaticCalculator.substract(firstArg, secondArg); break;
                case '/': nonStaticCalculator.divide(firstArg, secondArg); break;
                case '*': nonStaticCalculator.multiply(firstArg, secondArg); break;
                default: System.out.println("Niepoprawna wartość");
            }
            System.out.println("Dziękuje");
            System.out.println(nonStaticCalculator.getCounter());
        }
    }
