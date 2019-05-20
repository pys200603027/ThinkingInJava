package com.example.pattern_proxy.example_1;

public class ProxySubject implements Subject {

    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void visit() {
        if (subject != null) {
            subject.visit();
        }
    }
}
