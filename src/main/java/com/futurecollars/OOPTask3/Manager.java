package com.futurecollars.OOPTask3;

public class Manager extends BaseEmployee {

    public static final int MANAGER_BASE_SALARY = 5000;
    public static int BONUS = 500;

    public Manager(String name, String surname, int baseSalary, int employmentDate) {
        super(name, surname, MANAGER_BASE_SALARY, employmentDate);
        BONUS = this.BONUS;
    }

    public Manager(String name, String surname, int employmentDate) {
        super(name, surname, MANAGER_BASE_SALARY, employmentDate);
        BONUS = this.BONUS;
    }

    public Manager(int baseSalary, int employmentDate) {
        super(baseSalary, employmentDate);
        BONUS = this.BONUS;
    }

    public void setBonus(int bonus) {
        this.BONUS = bonus;
    }

    @Override
    public int calculateMonthlySalary() {
        return BONUS+(super.getBaseSalary());
    }
}
