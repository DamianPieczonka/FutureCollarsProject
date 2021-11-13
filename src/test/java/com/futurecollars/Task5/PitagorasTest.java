package com.futurecollars.Task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PitagorasTest {
    @Test
    void shouldCheckIfRectangular() {
        int value1 = 3;
        int value2 = 4;
        int value3 = 5;
        String message = Pitagoras.pitagoras(value1, value2, value3);
        Assertions.assertEquals("Triangle is rectangular", message);
    }
    @Test
    void shouldCheckIfDoesNotExist() {
        int value1 = 3;
        int value2 = 1;
        int value3 = 5;
        String message = Pitagoras.pitagoras(value1, value2, value3);
        Assertions.assertEquals("Triangle does not exist", message);
    }
    @Test
    void shouldCheckIfNotRectangular() {
        int value1 = 3;
        int value2 = 6;
        int value3 = 8;
        String message = Pitagoras.pitagoras(value1, value2, value3);
        Assertions.assertEquals("Triangle is not rectangular", message);
    }



}