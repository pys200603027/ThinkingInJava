package com.example.pattern_bridge.example_3;

public abstract class Abstraction {
    protected Implementor implementor;

    public void operation() {
        //Todo wirte your code
        implementor.operationImpl();
    }
}
