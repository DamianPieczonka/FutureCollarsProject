package com.futurecollars.OOPTask3;

public class Manager extends BaseEmployee {

    private int bonus = BaseEmployee.managerBonus;

    public Manager(String name, String surname, int baseSalary, int employmentDate) {
        super(name, surname, baseSalary, employmentDate);
        bonus = BaseEmployee.managerBonus;
    }

    public Manager(String name, String surname, int employmentDate) {
        super(name, surname, BaseEmployee.managerBaseSalary, employmentDate);
        bonus = BaseEmployee.managerBonus;
    }

    public Manager(int baseSalary, int employmentDate) {
        super(baseSalary, employmentDate);
        bonus = BaseEmployee.managerBonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int calculateMonthlySalary() {
        return bonus+(super.getBaseSalary());
    }
}
