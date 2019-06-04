package com.example.pattern_bridge.example_2.plane;

import com.example.pattern_bridge.example_2.maker.AirplaneMaker;

public abstract class Airplane {
    public abstract void fly();

    protected AirplaneMaker airplaneMaker;

    public Airplane(AirplaneMaker airplaneMaker) {
        this.airplaneMaker = airplaneMaker;
    }
}
