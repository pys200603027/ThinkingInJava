package com.example.pattern_adapter.example_2.adapter;

import com.example.pattern_adapter.example_2.Voltage220;

public class AdapterTo5V extends Adapter3 {
    public AdapterTo5V(Voltage220 voltage220) {
        super(voltage220);
    }

    @Override
    public int output5V() {
        int outputVoltage = 0;
        if (voltage220 != null) {
            outputVoltage = voltage220.output220V() / 44;
        }
        return outputVoltage;

    }
}
