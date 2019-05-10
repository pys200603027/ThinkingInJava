package com.example.pattern_composite.example_2;

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("not support");
    }

    @Override
    public void remove(Component component) {
        System.out.println("not support");
    }

    @Override
    public void display(int level) {
        System.out.println("-" + level + " " + name);
    }
}
