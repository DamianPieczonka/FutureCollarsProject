package com.futurecollars.JunitTask1;

public class NumberValidatorAndSum {

    public boolean isDividedBy2(int value) {
        return value % 2 == 0;
    }

    public int sumOfNumber(int value) {
        return String.valueOf(value)
                .chars()
                .map(Character::getNumericValue)
                .sum();
    }
}
