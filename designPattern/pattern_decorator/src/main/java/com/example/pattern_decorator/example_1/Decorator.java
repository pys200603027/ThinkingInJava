package com.example.pattern_decorator.example_1;

/**
 * 装饰者
 */
public class Decorator implements MilkyTea {

    private MilkyTea milkyTea;

    public Decorator(MilkyTea milkyTea) {
        this.milkyTea = milkyTea;
    }

    @Override
    public void recipe() {
        milkyTea.recipe();
    }
}
