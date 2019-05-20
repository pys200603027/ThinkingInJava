package com.example.pattern_proxy.example_1;

public class RealSubject implements Subject {
    private String name = "Real visit";

    @Override
    public void visit() {
        System.out.println(name);
    }
}
