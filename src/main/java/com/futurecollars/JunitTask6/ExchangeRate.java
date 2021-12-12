package com.futurecollars.JunitTask6;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ExchangeRate {
    public double getPlnBuyRateFor(Currency currency) {
        String url_str = "https://v6.exchangerate-api.com/v6/75dbab5f7ce2413e56ce1930/latest/" + currency.name();
        try {
            URL url = new URL(url_str);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();
            JsonElement root = JsonParser.parseReader(new InputStreamReader((InputStream) request.getContent()));
            JsonObject jsonobj = root.getAsJsonObject();
            JsonElement req_result = jsonobj.get("conversion_rates").getAsJsonObject().get(Currency.PLN.name());
            return req_result.getAsDouble();
        } catch (IOException e) {
            throw new RuntimeException("Can not get exchange rate for " + currency.name());
        }
    }

    public double getPlnSellRateFor(Currency currency) {
        String url_str = "https://v6.exchangerate-api.com/v6/75dbab5f7ce2413e56ce1930/latest/PLN";
        try {
            URL url = new URL(url_str);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();
            JsonElement root = JsonParser.parseReader(new InputStreamReader((InputStream) request.getContent()));
            JsonObject jsonobj = root.getAsJsonObject();
            JsonElement req_result = jsonobj.get("conversion_rates").getAsJsonObject().get(currency.name());
            return req_result.getAsDouble();
        } catch (IOException e) {
            throw new RuntimeException("Can not get exchange rate for PLN");
        }
    }
}
