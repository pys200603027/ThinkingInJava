package com.example.pattern_flyweight.example_1;

import java.util.HashMap;

public class FlyWeghtFactory {
    private static HashMap<String, FlyWeight> pool = new HashMap<>();

    public static FlyWeight getFlyweight(String exTrinsic) {
        FlyWeight flyWeight = null;

        if (pool.containsKey(exTrinsic)) {
            flyWeight = pool.get(exTrinsic);
        } else {
            flyWeight = new ConcreteFlyWeight(exTrinsic);
            pool.put(exTrinsic, flyWeight);
        }

        return flyWeight;
    }
}
