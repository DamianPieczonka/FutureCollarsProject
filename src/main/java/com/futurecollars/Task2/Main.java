package com.futurecollars.Task2;
import java.util.Scanner;

public class Main{

public static void main(String[] args) {

            System.out.println("Input:");
            Scanner scanner = new Scanner(System.in);
            double firstArg = scanner.nextDouble();
            double secondArg = scanner.nextDouble();

            char operation = scanner.next().charAt(0);

            Calculator Calculator = new Calculator();
            switch (operation) {
                case '+': Calculator.sum(firstArg, secondArg); break;
                case '-': Calculator.substract(firstArg, secondArg); break;
                case '/': Calculator.divide(firstArg, secondArg); break;
                case '*': Calculator.multiply(firstArg, secondArg); break;
                default: System.out.println("Niepoprawna wartość");
            }
            System.out.println("Dziękuje");
        }
    }
