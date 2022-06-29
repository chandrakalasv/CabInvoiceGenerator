package com.bridgelab;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

public class InVoiceBill {
 @Setter
 @Getter
    int totalRides;
    double totalFare;
    int avgRide;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InVoiceBill that = (InVoiceBill) o;
        return totalRides == that.totalRides && Double.compare(that.totalFare, totalFare) == 0 && avgRide == that.avgRide;
    }

    public InVoiceBill(int totalRides, double totalFare, int avgRide) {
        this.totalRides = totalRides;
        this.totalFare = totalFare;
        this.avgRide = avgRide;
    }

    @Override
    public String toString() {
        return "InVoiceBill{" +
                "totalRides=" + totalRides +
                ", totalFare=" + totalFare +
                ", avgRide=" + avgRide +
                '}';
    }
}
