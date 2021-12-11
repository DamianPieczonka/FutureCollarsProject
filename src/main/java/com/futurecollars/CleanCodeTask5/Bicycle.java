package com.futurecollars.CleanCodeTask5;

public class Bicycle implements Vehicle{
    @Override
    public boolean isEngineStarted() {
        throw new UnsupportedOperationException("Bicycle does not have engine");
    }
}
