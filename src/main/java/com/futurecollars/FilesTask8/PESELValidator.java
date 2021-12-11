package com.futurecollars.FilesTask8;

public class PESELValidator {
    private static final int LENGTH = 11;

    public boolean validate(String value) {
        if (null == value) {
            throw new WrongTypeOfDataException("Provided value must contain only numbers.");
        }
        try {
            Double.parseDouble(value);
        } catch (NumberFormatException e) {
            throw new WrongTypeOfDataException("Provided value must contain only numbers.");
        }
        if (value.length() != LENGTH) {
            throw new IllegalLengthException("Provided value has wrong length");
        }
        return true;
    }

}
