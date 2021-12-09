package com.futurecollars.OOP2Task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class TriangleTest {
    private static final double TOLERANCE = 0.01;

    @Test
    void shouldCreateTriangle() {
        Shape exampleTriangle = new Triangle(6d);
        assertNotNull(exampleTriangle);
        assertEquals(15.58, exampleTriangle.getArea(), TOLERANCE);
        assertEquals(18, exampleTriangle.getPerimeter());
    }

    @Test
    void shouldCreateTriangleForFloatNumber() {
        Shape exampleTriangle = new Triangle(6.3);
        assertNotNull(exampleTriangle);
        assertEquals(17.18, exampleTriangle.getArea(), TOLERANCE);
        assertEquals(18.9, exampleTriangle.getPerimeter());
    }

}