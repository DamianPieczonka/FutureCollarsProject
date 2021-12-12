package com.futurecollars.JunitTask8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SaturdayExtraSalaryTest {

    @Test
    public void shouldReturnExtraSalary() {
        SaturdayExtraSalary saturdayExtraSalary = new SaturdayExtraSalary(100, 2);
        assertEquals(200, saturdayExtraSalary.getSalary());
    }

}
