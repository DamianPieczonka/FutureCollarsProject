package com.futurecollars.OOPTask3;

public class TicketSeller extends BaseEmployee {
    public static final int TICKET_SELLER_BASE_SALARY = 3000;

    public TicketSeller(String name, String surname, int baseSalary, int employmentDate) {
        super(name, surname, baseSalary, employmentDate);
    }

    public TicketSeller(String name, String surname, int employmentDate) {
        super(name, surname, TICKET_SELLER_BASE_SALARY, employmentDate);
    }

    public TicketSeller(int baseSalary, int employmentDate) {
        super(baseSalary, employmentDate);
    }

    @Override
    public int calculateMonthlySalary() {
        return super.getBaseSalary();
    }
}
