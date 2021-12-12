package com.futurecollars.Lesson10Task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PESELRegexpValidator {

    public boolean validate(String value) {
        if (null == value) {
            return false;
        }
        Pattern pattern = Pattern.compile("[0-9]{11}");
        Matcher matcher = pattern.matcher(value);
        return matcher.find();
    }

}
