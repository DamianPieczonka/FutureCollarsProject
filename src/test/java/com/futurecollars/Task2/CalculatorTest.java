package com.futurecollars.Task2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    void shouldAddTwoValues_MinusOneAndThree() {
        Calculator calculator = new Calculator();
        int value1 = -1;
        int value2 = 3;

        double sum = calculator.sum(value1, value2);

        Assertions.assertEquals( 2, sum);

    }
    @Test
    void shouldSubstract_MinusTwoAndMinusFive() {
        Calculator calculator = new Calculator();
        int value1 = -2;
        int value2 = -5;

        double substract = calculator.substract(value1, value2);

        Assertions.assertEquals( 3, substract);
    }
    @Test
    void shouldMultiply_TwoAndAHalfAndMinusThree() {
        Calculator calculator = new Calculator();
        double value1 = 2.5;
        double value2 = -3;

        double multiply = calculator.multiply(value1, value2);

        Assertions.assertEquals( -7.5, multiply);
    }
    @Test
    void shouldMultiply_SixAndZero() {
        Calculator calculator = new Calculator();
        double value1 = 6;
        double value2 = 0;

        double multiply = calculator.multiply(value1, value2);

        Assertions.assertEquals( 0, multiply);
    }


    @Test
    void shouldDivideTwoValues_EightAndZero() {
        Calculator calculator = new Calculator();
        int value1 = 8;
        int value2 = 0;

        Assertions.assertThrows(RuntimeException.class, () -> {

            double result = calculator.divide(value1, value2);

        });
    }
    @Test
        void shouldDivide_TwoAndAHalfAndTwoAndAHalf(){
        Calculator calculator = new Calculator();
        double value1 = 2.5;
        double value2 = 2.5;

        double divide = calculator.divide(value1, value2);

        Assertions.assertEquals( 1, divide);


    }
}