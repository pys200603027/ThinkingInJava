package com.example.pattern_bridge.example_1.bridge;

import com.example.pattern_bridge.example_1.DisplayImpl;

/**
 * 继续扩展父类
 */
public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    /**
     * 继续扩展了父类的方法
     *
     * @param times
     */
    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
