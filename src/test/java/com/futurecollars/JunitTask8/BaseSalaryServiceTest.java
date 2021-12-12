package com.futurecollars.JunitTask8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BaseSalaryServiceTest {

    @Test
    public void shouldReturnBaseSalary() {
        BaseSalaryService baseSalaryService = new BaseSalaryService(20);
        assertEquals(20, baseSalaryService.getSalary());
    }

}
