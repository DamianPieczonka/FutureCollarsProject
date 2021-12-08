package com.futurecollars.OOPTask3;

public abstract class BaseEmployee {
    public static final int ticketSellerBaseSalary = 3000;
    public static final int managerBaseSalary = 5000;
    public static final int managerBonus = 500;

    private String name;
    private String surname;
    private int baseSalary;
    private int employmentDate = 2021;

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
