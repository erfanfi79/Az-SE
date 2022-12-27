package com.unittest.codecoverage.models;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class TrafficTest {

    public Traffic getSampleTraffic(){
        Traffic traffic=new Traffic();
        traffic.setIntenseCarTraffic(true);
        traffic.setCurrentTrafficLight(TrafficLigth.GREEN);
        traffic.setMaxSpeedAllowed((short) 50);
        traffic.setMinSpeedAllowed((short) 20);
        traffic.setStreetDirectionFlow(StreetDirectionFlow.ONE_WAY);
        return traffic;
    }

    @Test
    public void testTrafficLightSet() {
        Traffic traffic=getSampleTraffic();

        TrafficLigth expected = TrafficLigth.RED;
        traffic.setCurrentTrafficLight(expected);
        TrafficLigth actual = TrafficLigth.RED;

        assertEquals(expected, actual, "TrafficLight not set");
    }

    @Test
    public void testStreetDirectionFlowSet() {
        Traffic traffic=getSampleTraffic();

        StreetDirectionFlow expected = StreetDirectionFlow.TWO_WAY;
        traffic.setStreetDirectionFlow(expected);
        StreetDirectionFlow actual = traffic.getStreetDirectionFlow();

        assertEquals(expected, actual, "StreetDirectionFlow not set");
    }

    @Test
    public void testMaxSpeedAllowedSet() {
        Traffic traffic=getSampleTraffic();

        short expected = 100;
        traffic.setMaxSpeedAllowed(expected);
        short actual =traffic.getMaxSpeedAllowed() ;

        assertEquals(expected, actual, "max speed not set");
    }
}
