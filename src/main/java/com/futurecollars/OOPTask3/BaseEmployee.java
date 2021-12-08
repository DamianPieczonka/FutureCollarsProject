package com.futurecollars.OOPTask3;

public abstract class BaseEmployee {

    private String name;
    private String surname;
    private int BASE_SALARY;
    private int employmentDate;

    public BaseEmployee(String name, String surname, int baseSalary, int employmentDate) {
        this.name = name;
        this.surname = surname;
        this.BASE_SALARY = baseSalary;
        this.employmentDate = employmentDate;
    }

    public BaseEmployee(int baseSalary, int employmentDate) {
        this.BASE_SALARY = baseSalary;
        this.employmentDate = employmentDate;
    }

    public final int getBaseSalary() {
        return BASE_SALARY;
    }

    public final int getEmploymentDate() {
        return 2021 - employmentDate;
    }

    public abstract int calculateMonthlySalary();
}
