package com.example.pattern_bridge.example_2.plane;

import com.example.pattern_bridge.example_2.maker.AirplaneMaker;

public class CargoPlane extends Airplane {

    public CargoPlane(AirplaneMaker airplaneMaker) {
        super(airplaneMaker);
    }

    @Override
    public void fly() {

    }
}
