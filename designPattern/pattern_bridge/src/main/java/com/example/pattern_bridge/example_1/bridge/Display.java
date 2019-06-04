package com.example.pattern_bridge.example_1.bridge;

import com.example.pattern_bridge.example_1.DisplayRaw;

/**
 * bridge 同时扩展类
 */
public class Display {
    private DisplayRaw impl;

    public Display(DisplayRaw impl) {
        this.impl = impl;
    }

    public void open() {
        impl.rawOpen();
    }

    public void print() {
        impl.rawPrint();
    }

    public void close() {
        impl.rawClose();
    }

    /**
     * 扩展了
     */
    public final void display() {
        open();
        print();
        close();
    }

}
