package com.example.pattern_visitor.example_2;

import java.util.Iterator;

/**
 * 声明了访问方法
 */
public abstract class Entry implements Element {

    public abstract String getName();

    public abstract int getSize();

    public abstract void printList(String prefix);

    public void printList() {
        printList("");
    }

    public Entry add(Entry entry) throws RuntimeException {
        throw new RuntimeException();
    }

    public Iterator iterator() throws RuntimeException {
        throw new RuntimeException();
    }

    @Override
    public String toString() {
        return getName() + "<" + getSize() + ">";
    }

}
