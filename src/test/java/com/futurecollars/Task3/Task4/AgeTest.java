package com.futurecollars.Task3.Task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AgeTest {
    @Test
    void shouldCheckIfEqualsOrIsOver18 () {
        Age age = new Age();

        int value1 = 18;

        boolean number = Age.number(value1);

        Assertions.assertTrue(number);
    }
    @Test
    void shouldCheckIfLowerThan18 () {
        Age age = new Age();

        int value1 = 12;

        boolean number = Age.number(value1);

        Assertions.assertFalse(number);
    }
}