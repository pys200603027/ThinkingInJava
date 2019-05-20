package com.example.pattern_decorator.example_1;

/**
 * 添加了红豆
 */
public class MilkyTeaBDecorator extends Decorator {

    public MilkyTeaBDecorator(MilkyTea milkyTea) {
        super(milkyTea);
    }

    @Override
    public void recipe() {
        super.recipe();
        recipeD();
    }

    public void recipeD() {
        System.out.println("老板你再给加点红豆吧");
    }
}
