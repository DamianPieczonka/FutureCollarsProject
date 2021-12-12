package com.futurecollars.OOP2Task4;

public class TextFormatterUpperCase implements TextFormatter{
    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}
