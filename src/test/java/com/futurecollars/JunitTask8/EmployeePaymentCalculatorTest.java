package com.futurecollars.JunitTask8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class EmployeePaymentCalculatorTest {

    private final BaseSalaryService baseSalaryService = mock(BaseSalaryService.class);
    private final SaturdayExtraSalary saturdayExtraSalary = mock(SaturdayExtraSalary.class);
    private EmployeePaymentCalculator employeePaymentCalculator;


    @Test
    public void shouldCalculateEmployeeSalary() {
        employeePaymentCalculator = new EmployeePaymentCalculator(baseSalaryService, saturdayExtraSalary, 20);
        when(baseSalaryService.getSalary()).thenReturn(1500.0);
        when(saturdayExtraSalary.getSalary()).thenReturn(300.0);

        assertEquals(1820, employeePaymentCalculator.calculate());
    }
}
