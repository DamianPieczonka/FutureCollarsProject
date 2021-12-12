package com.futurecollars.JunitTask8;

public class SaturdayExtraSalary {
    private double extraSalary;
    private int numberOfDays;

    public SaturdayExtraSalary(double extraSalary, int numberOfDays) {
        this.extraSalary = extraSalary;
        this.numberOfDays = numberOfDays;
    }

    public double getSalary() {
        return extraSalary * numberOfDays;
    }
}
