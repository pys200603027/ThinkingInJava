package com.example.pattern_bridge.example_2.plane;

import com.example.pattern_bridge.example_2.maker.AirplaneMaker;

public class PassengerPlane extends Airplane {
    public PassengerPlane(AirplaneMaker airplaneMaker) {
        super(airplaneMaker);
    }

    @Override
    public void fly() {

    }
}
