package com.futurecollars.Task2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    void shouldAddTwoValues_Minus1AndThree() {
        Calculator calculator = new Calculator();
        int value1 = -1;
        int value2 = 3;

        double sum = calculator.sum(value1, value2);

        Assertions.assertEquals( 2, sum);

    }
    @Test
    void TestingSubstraction() {
        Calculator calculator = new Calculator();
        int value1 = -2;
        int value2 = -5;

        double substractOne = calculator.substract(value1, value2);

        Assertions.assertEquals( 3, substractOne);
        int value3 = 0;
        int value4 = 1;

        double substractTwo = calculator.substract(value3, value4);

        Assertions.assertEquals( -1, substractTwo);


    }
    @Test
    void TestingMultiplication() {
        Calculator calculator = new Calculator();
        double value1 = 2.5;
        double value2 = -3;

        double multiplyOne = calculator.multiply(value1, value2);

        Assertions.assertEquals( -7.5, multiplyOne);

        double value3 = 2.5;
        double value4 = 0;

        double multiplyTwo = calculator.multiply(value3, value4);

        Assertions.assertEquals( 0, multiplyTwo);

    }


    @Test
    void shouldDivideTwoValues_EightAndZero() {
        Calculator calculator = new Calculator();
        int value1 = 8;
        int value2 = 0;

        Assertions.assertThrows(RuntimeException.class, () -> {

            double result = calculator.divide(value1, value2);

        });
        double value3 = 2.5;
        double value4 = 2.5;

        double divide = calculator.divide(value3, value4);

        Assertions.assertEquals( 1, divide);


    }
}