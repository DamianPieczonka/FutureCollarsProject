package com.futurecollars.CleanCodeTask5;

public class Car extends Vehicle {
    private boolean engineStarted;
    protected void startEngine() {
        if (!engineStarted) {
            engineStarted = true;
        }
    }

    protected void stopEngine() {
        if (engineStarted) {
            engineStarted = false;
        }
    }
    public void setEngineStarted(boolean engineStarted) {
        this.engineStarted = engineStarted;
    }
}
