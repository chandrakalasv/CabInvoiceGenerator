package com.bridgelab;

import org.junit.Assert;
import org.junit.Test;

public class InVoiceGeneratorTest {
    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        InVoiceGenerator inVoiceGenerator = new InVoiceGenerator();
        double fare = inVoiceGenerator.getFare(4, 15);
        Assert.assertEquals(55, fare, 0.0);
    }
    @Test
    public void givenDistanceAndTime_WhenTotalFareLessThan10_ShouldReturnMinFare() {
        InVoiceGenerator inVoiceGenerator = new InVoiceGenerator();
        double fare = inVoiceGenerator.getFare(0.100, 1);
        Assert.assertEquals(5, fare, 0.0);
    }
}
