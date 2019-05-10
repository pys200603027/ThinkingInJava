package com.example.pattern_composite.example_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Composite extends Component {
    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int level) {

        Iterator<Component> iterator = children.iterator();
        while (iterator.hasNext()) {
            Component component = iterator.next();
            component.display(level + 2);
        }
    }
}
