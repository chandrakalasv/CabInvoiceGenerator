package com.bridgelab;

public class Ride {
    double distance;
    int time;

    public Ride(double distance, int time) {
        this.distance = distance;
        this.time = time;
    }

    public double getDistance() {
        return distance;
    }

    public int getTime() {
        return time;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "distance=" + distance +
                ", time=" + time +
                '}';
    }
}
