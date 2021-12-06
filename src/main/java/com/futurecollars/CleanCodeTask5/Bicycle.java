package com.futurecollars.CleanCodeTask5;

public class Bicycle extends Vehicle{
    @Override
    public boolean isEngineStarted() {
        throw new UnsupportedOperationException("Bicycle does not have engine");
    }
}
