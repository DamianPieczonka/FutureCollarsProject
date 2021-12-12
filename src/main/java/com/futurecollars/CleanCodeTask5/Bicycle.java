package com.futurecollars.CleanCodeTask5;

public class Bicycle implements VehicleTwo {
    private boolean sittingOnBike;

    protected void setSittingOnBike(boolean sittingOnBike) {
        this.sittingOnBike = sittingOnBike;
    }

    @Override
    public boolean isEngineStarted() {
        throw new UnsupportedOperationException("Bicycle does not have engine");
    }

    @Override
    public boolean isSittingOnBike() {
        return sittingOnBike;
    }

}
