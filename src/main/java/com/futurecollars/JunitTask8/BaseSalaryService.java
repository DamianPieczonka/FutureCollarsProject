package com.futurecollars.JunitTask8;

public class BaseSalaryService {
    private double baseSalary;

    public BaseSalaryService(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getSalary() {
        return baseSalary;
    }
}
