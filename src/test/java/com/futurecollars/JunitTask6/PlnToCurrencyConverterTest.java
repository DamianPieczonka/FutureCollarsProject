package com.futurecollars.JunitTask6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PlnToCurrencyConverterTest {

    private final ExchangeRate exchangeRate = mock(ExchangeRate.class);

    private final PlnToCurrencyConverter plnToCurrencyConverter = new PlnToCurrencyConverter(exchangeRate);

    @Test
    public void shouldConvertPlnToEur() {
        when(exchangeRate.getPlnBuyRateFor(Currency.EUR)).thenReturn(4.0);

        double result = plnToCurrencyConverter.buyPln(1000, Currency.EUR);

        assertEquals(4000, result);
    }

    @Test
    public void shouldConvertPlnToGBP() {
        when(exchangeRate.getPlnBuyRateFor(Currency.GBP)).thenReturn(5.0);

        double result = plnToCurrencyConverter.buyPln(1000, Currency.GBP);

        assertEquals(5000, result);
    }

    @Test
    public void shouldConvertPlnToUSD() {
        when(exchangeRate.getPlnBuyRateFor(Currency.USD)).thenReturn(4.5);

        double result = plnToCurrencyConverter.buyPln(1000, Currency.USD);

        assertEquals(4500, result);
    }

    @Test
    public void shouldConvertEurToPln() {
        when(exchangeRate.getPlnSellRateFor(Currency.EUR)).thenReturn(0.25);

        double result = plnToCurrencyConverter.sellPln(1000, Currency.EUR);

        assertEquals(250, result);
    }

    @Test
    public void shouldConvertGBPtoPln() {
        when(exchangeRate.getPlnSellRateFor(Currency.GBP)).thenReturn(0.19);

        double result = plnToCurrencyConverter.sellPln(1000, Currency.GBP);

        assertEquals(190, result);
    }

    @Test
    public void shouldConvertUSDToPln() {
        when(exchangeRate.getPlnSellRateFor(Currency.USD)).thenReturn(0.23);

        double result = plnToCurrencyConverter.sellPln(1000, Currency.USD);

        assertEquals(230, result);
    }


}
