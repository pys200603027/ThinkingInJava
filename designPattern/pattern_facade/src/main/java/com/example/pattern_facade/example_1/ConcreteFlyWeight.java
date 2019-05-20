package com.example.pattern_facade.example_1;

public class ConcreteFlyWeight extends FlyWeight {

    public ConcreteFlyWeight(String exTrinsic) {
        super(exTrinsic);
    }

    @Override
    public void operate() {
        System.out.println("ConcreteFlyWeight operate.");
    }
}
