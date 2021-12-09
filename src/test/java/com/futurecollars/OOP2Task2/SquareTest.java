package com.futurecollars.OOP2Task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class SquareTest {

    @Test
    void shouldCreateSquare() {
        Shape exampleSquare = new Square(4d);
        assertNotNull(exampleSquare);
        assertEquals(16d, exampleSquare.getArea());
        assertEquals(16d, exampleSquare.getPerimeter());
    }

    @Test
    void shouldCreateSquareForFloatNumber() {
        Shape exampleSquare = new Square(4.3);
        assertNotNull(exampleSquare);
        assertEquals(18.49, exampleSquare.getArea());
        assertEquals(17.2, exampleSquare.getPerimeter());
    }

    @Test
    void checkPolymorphism() {
        Rectangle exampleRectangle = new Square( 5d);
        assertEquals(25, exampleRectangle.getArea());
        assertEquals(20, exampleRectangle.getPerimeter());
    }
}