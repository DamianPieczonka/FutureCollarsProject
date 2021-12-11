package com.futurecollars.JunitTask4;

public class TextLength {

    public int returnTextLength(String text) {
        if (null == text) {
            return 0;
        }
        return text.length();
    }
}
