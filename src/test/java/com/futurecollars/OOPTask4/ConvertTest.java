package com.futurecollars.OOPTask4;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

class ConvertTest {

    @Test
    void shouldCheckIfConvertsDouble() {
        double minutes = 5.3;
        double value = Convert.convertion(minutes);
        Assertions.assertEquals(318, value);
    }

    @Test
    void shouldCheckIfConvertsInt() {
        double minutes = 2;
        double value = Convert.convertion(minutes);
        Assertions.assertEquals(120, value);
    }

}