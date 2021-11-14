package com.futurecollars.Task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PitagorasTest {
    @Test
    void shouldCheckIfRectangular() {
        int value1 = 3;
        int value2 = 4;
        int value3 = 5;
        boolean value = Pitagoras.pitagoras(value1, value2, value3);
        Assertions.assertTrue(value);
    }
    @Test
    void shouldCheckIfNotRectangular() {
        int value1 = 3;
        int value2 = 6;
        int value3 = 5;
        boolean value = Pitagoras.pitagoras(value1, value2, value3);
        Assertions.assertFalse(value);
    }
    @Test
    void shouldCheckIfDoesNotExist() {
        int value1 = 2;
        int value2 = 1;
        int value3 = 7;
        boolean value = Pitagoras.pitagoras(value1, value2, value3);
        Assertions.assertFalse(value);
    }





}