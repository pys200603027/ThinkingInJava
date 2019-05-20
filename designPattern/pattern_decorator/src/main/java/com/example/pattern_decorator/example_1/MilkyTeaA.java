package com.example.pattern_decorator.example_1;

/**
 * 一种奶茶实现
 */
public class MilkyTeaA implements MilkyTea {

    @Override
    public void recipe() {
        System.out.println("老板来一杯奶茶,加冰块");
    }
}
