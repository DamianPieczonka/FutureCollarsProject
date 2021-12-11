package com.futurecollars.JunitTask1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberValidatorAndSumTest {

    NumberValidatorAndSum numberValidatorAndSum = new NumberValidatorAndSum();

    @ParameterizedTest
    @ValueSource(ints = {1, 333, 515, -3, 15})
    void isDividedBy2_shouldReturnFalseForNumberNotDividedByTwo(int number) {
        assertFalse(numberValidatorAndSum.isDividedBy2(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 500, 0, -300, 1500})
    void isDividedBy2_shouldReturnTrueForNumberDividedByTwo(int number) {
        assertTrue(numberValidatorAndSum.isDividedBy2(number));
    }

    @ParameterizedTest
    @CsvSource(value = {"111111:6", "2123123:14", "101:2"}, delimiter = ':')
    void sumOfNumber_shouldReturnSum(String input, String expected) {
        assertEquals(Integer.parseInt(expected), numberValidatorAndSum.sumOfNumber(Integer.parseInt(input)));
    }
}
