package com.futurecollars.OOPTask3;

public abstract class BaseEmployee {

    private String name;
    private String surname;
    private int baseSalary;
    private int employmentDate;

    public BaseEmployee(String name, String surname, int baseSalary, int employmentDate) {
        this.name = name;
        this.surname = surname;
        this.baseSalary = baseSalary;
        this.employmentDate = employmentDate;
    }

    public BaseEmployee(int baseSalary, int employmentDate) {
        this.baseSalary = baseSalary;
        this.employmentDate = employmentDate;
    }

    public final int getBaseSalary() {
        return baseSalary;
    }

    public final int getEmploymentDate() {
        return 2021 - employmentDate;
    }

    public abstract int calculateMonthlySalary();
}
