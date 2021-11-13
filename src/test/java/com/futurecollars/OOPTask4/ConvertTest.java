package com.futurecollars.OOPTask4;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

class ConvertTest {

    @Test
    void shouldCheckIfConvertsDouble() {
        double minutes = 5.3;
        double seconds = minutes * 60;
        Assertions.assertEquals(318, seconds);
    }

    @Test
    void shouldCheckIfConvertsInt() {
        double minutes = 2;
        double seconds = minutes * 60;
        Assertions.assertEquals(120, seconds);
    }

}