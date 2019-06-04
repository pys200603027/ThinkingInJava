package com.example.pattern_bridge.example_1;

/**
 * 基本实现类
 */
public class StringDisplayRaw extends DisplayRaw {

    private String string;
    private int width;

    public StringDisplayRaw(String string) {
        this.string = string;
        this.width = string.length();
    }

    @Override
    public void rawOpen() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void rawClose() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.println("*************************");

    }
}
