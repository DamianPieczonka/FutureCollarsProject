package com.futurecollars.JunitTask6;

public class Main {
    public static void main(String[] args) {
        ExchangeRate exchangeRate = new ExchangeRate();

        System.out.println("1 EUR is " + exchangeRate.getPlnBuyRateFor(Currency.EUR) + " PLN");
        System.out.println("1 GBP is " + exchangeRate.getPlnBuyRateFor(Currency.GBP) + " PLN");
        System.out.println("1 USD is " + exchangeRate.getPlnBuyRateFor(Currency.USD) + " PLN");

        System.out.println("1 PLN is " + exchangeRate.getPlnSellRateFor(Currency.EUR) + " EUR");
        System.out.println("1 PLN is " + exchangeRate.getPlnSellRateFor(Currency.GBP) + " GBP");
        System.out.println("1 PLN is " + exchangeRate.getPlnSellRateFor(Currency.USD) + " USD");
    }
}
