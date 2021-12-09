package com.futurecollars.OOP2Task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CircleImplTest {
    private static final double TOLERANCE = 0.01;

    @Test
    void shouldCreateCircle() {
        Shape exampleCircle = new CircleImpl(4d);
        assertNotNull(exampleCircle);
        assertEquals(50.27, exampleCircle.getArea(), TOLERANCE);
        assertEquals(25.13, exampleCircle.getPerimeter(), TOLERANCE);
    }

    @Test
    void shouldCreateCircleForFloatNumber() {
        Shape exampleCircle = new CircleImpl(4.3);
        assertNotNull(exampleCircle);
        assertEquals(58.09, exampleCircle.getArea(), TOLERANCE);
        assertEquals(27.02, exampleCircle.getPerimeter(), TOLERANCE);
    }
}
