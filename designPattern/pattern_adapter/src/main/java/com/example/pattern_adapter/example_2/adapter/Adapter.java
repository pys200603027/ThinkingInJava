package com.example.pattern_adapter.example_2.adapter;

import com.example.pattern_adapter.example_2.Voltage220;
import com.example.pattern_adapter.example_2.Voltage5;

/**
 * 通过适配器将220V 转换成 5V
 */
public class Adapter extends Voltage220 implements Voltage5 {

    @Override
    public int out5V() {
        int intputVoltage = output220V();
        System.out.println("start adapting...");
        int outputVoltage = intputVoltage / 44;
        System.out.println("finish adapting..." + outputVoltage);
        return outputVoltage;
    }
}
