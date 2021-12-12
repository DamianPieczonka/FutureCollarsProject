package com.futurecollars.JunitTask8;

public class EmployeePaymentCalculator {
    private BaseSalaryService baseSalaryService;
    private SaturdayExtraSalary saturdayExtraSalary;
    private double bonus;

    public EmployeePaymentCalculator(
            BaseSalaryService baseSalaryService,
            SaturdayExtraSalary saturdayExtraSalary,
            double bonus) {
        this.baseSalaryService = baseSalaryService;
        this.saturdayExtraSalary = saturdayExtraSalary;
        this.bonus = bonus;
    }

    double calculate(){
        return baseSalaryService.getSalary() + bonus + saturdayExtraSalary.getSalary();
    }
}
