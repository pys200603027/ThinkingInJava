package com.example.pattern_adapter.example_2.adapter;

import com.example.pattern_adapter.example_2.DCOutput;
import com.example.pattern_adapter.example_2.Voltage220;

/**
 * 万能适配器Base Class
 */
public class Adapter3 implements DCOutput {
    protected Voltage220 voltage220;

    public Adapter3(Voltage220 voltage220) {
        this.voltage220 = voltage220;
    }

    @Override
    public int output5V() {
        return 0;
    }

    @Override
    public int output9V() {
        return 0;
    }

    @Override
    public int output12V() {
        return 0;
    }

    @Override
    public int output24V() {
        return 0;
    }
}
