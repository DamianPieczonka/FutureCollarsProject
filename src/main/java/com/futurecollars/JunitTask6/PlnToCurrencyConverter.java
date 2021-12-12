package com.futurecollars.JunitTask6;

public class PlnToCurrencyConverter {
    private final ExchangeRate exchangeRate;

    public PlnToCurrencyConverter(ExchangeRate exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double buyPln(double value, Currency currency) {
        return exchangeRate.getPlnBuyRateFor(currency) * value;
    }

    public double sellPln(double value, Currency currency) {
        return exchangeRate.getPlnSellRateFor(currency) * value;
    }
}
