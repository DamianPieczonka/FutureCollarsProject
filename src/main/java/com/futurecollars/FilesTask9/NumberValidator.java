package com.futurecollars.FilesTask9;

public class NumberValidator {
    public boolean validate(int[] values) {
        if (null == values) {
            return false;
        }
        boolean result = true;
        for (int value : values) {
            try {
                if (value % 3 != 0) {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                result = false;
            }
        }
        return result;
    }
}
