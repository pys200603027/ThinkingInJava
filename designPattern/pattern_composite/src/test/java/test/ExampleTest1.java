package test;

import com.example.pattern_composite.example_2.Component;
import com.example.pattern_composite.example_2.Composite;
import com.example.pattern_composite.example_2.Leaf;

import org.junit.Test;

import java.io.File;

public class ExampleTest1 {

    @Test
    public void test() {
        Component root = new Composite("root");

        root.add(new Leaf("Leaf A in Root"));
        root.add(new Leaf("Leaf B in Root"));

        Component branchX = new Composite("Branch X in root");
        Component branchY = new Composite("Branch Y in root");

        root.add(branchX);
        root.add(branchY);


        branchX.add(new Leaf("Leaf A in branchX"));


        root.display(1);
    }
}
