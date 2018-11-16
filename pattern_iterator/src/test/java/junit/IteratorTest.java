package junit;

import org.junit.Test;

import water.android.io.iterator.example1.Aggregate;
import water.android.io.iterator.example1.ConcreteAggregate;
import water.android.io.iterator.example1.Iterator;

public class IteratorTest {

    @Test
    public void test1() {
        Object[] objects = {"one", "two", "three", "four", "five"};

        Aggregate aggregate = new ConcreteAggregate(objects);

        Iterator iterator = aggregate.createIterator();

        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }

    }
}
