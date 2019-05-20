package com.example.pattern_adapter.example_2;

import com.example.pattern_adapter.example_2.adapter.Adapter3;

public class Laptop {

    public void charging(Voltage5 voltage5) {
        if (voltage5.out5V() == 5) {
            System.out.println("start charging");
        } else if (voltage5.out5V() > 5) {
            System.out.println("the volatage is too high!");
        }
    }

    public void charging(Adapter3 adapter3) {
        if (adapter3.output5V() == 5) {
            System.out.println("start charging");
        } else if (adapter3.output5V() > 5) {
            System.out.println("the volatage is too high!");
        }
    }
}
