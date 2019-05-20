package com.example.pattern_decorator.example_1;

/**
 * 添加了珍珠
 */
public class MilkyTeaADecorator extends Decorator {

    public MilkyTeaADecorator(MilkyTea milkyTea) {
        super(milkyTea);
    }

    @Override
    public void recipe() {
        super.recipe();
        recipeZ();
    }

    public void recipeZ() {
        System.out.println("老板再加点珍珠吧");
    }
}
