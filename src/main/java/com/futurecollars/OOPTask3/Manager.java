package com.futurecollars.OOPTask3;

public class Manager extends BaseEmployee {

    public static final int MANAGER_BASE_SALARY = 5000;
    public int bonus = 500;

    public Manager(String name, String surname, int baseSalary, int employmentDate) {
        super(name, surname, MANAGER_BASE_SALARY, employmentDate);
        bonus = this.bonus;
    }

    public Manager(String name, String surname, int employmentDate) {
        super(name, surname, MANAGER_BASE_SALARY, employmentDate);
        bonus = this.bonus;
    }

    public Manager(int baseSalary, int employmentDate) {
        super(baseSalary, employmentDate);
        bonus = this.bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int calculateMonthlySalary() {
        return bonus+(super.getBaseSalary());
    }
}
