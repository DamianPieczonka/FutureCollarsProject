package com.futurecollars.OOP2Task6;


public class BillCalculator {

    public double calculate(double billValue, float servicePayment) {
        return billValue + servicePayment;
    }

    public double calculate(double billValue, float servicePayment, double discount) {
        if (discount > billValue)
            return servicePayment;
        return billValue - discount + servicePayment;
    }

    public double calculate(double billValue, float servicePayment, short packingPayment) {
        return calculate(billValue, servicePayment) + packingPayment;
    }
}
