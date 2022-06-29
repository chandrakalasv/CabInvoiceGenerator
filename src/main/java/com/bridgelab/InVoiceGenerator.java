package com.bridgelab;

public class InVoiceGenerator {
    private final int COST_PER_KM = 10;
    private final int COST_PER_MIN = 1;
    private final int MIN_FARE = 5;
    public double getFare(double distance, int time) {
        double fare = distance * COST_PER_KM + time * COST_PER_MIN;
        if(fare < MIN_FARE) {
            return MIN_FARE;
        }
        return fare;
    }
}
