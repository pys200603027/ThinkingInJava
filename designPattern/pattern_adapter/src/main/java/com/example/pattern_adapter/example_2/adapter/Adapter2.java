package com.example.pattern_adapter.example_2.adapter;

import com.example.pattern_adapter.example_2.Voltage220;
import com.example.pattern_adapter.example_2.Voltage5;

/**
 * 组合代替了继承
 */
public class Adapter2 implements Voltage5 {
    private Voltage220 voltage220;

    public Adapter2(Voltage220 voltage220) {
        this.voltage220 = voltage220;
    }

    @Override
    public int out5V() {
        int outputVoltage = 0;
        if (voltage220 != null) {
            int intputVoltage = voltage220.output220V();
            System.out.println("start adapting...");
            outputVoltage = intputVoltage / 44;
            System.out.println("finish adapting..." + outputVoltage);
        }
        return outputVoltage;
    }
}
