package function.collection;

import org.junit.Test;

import java.util.AbstractList;
import java.util.HashSet;
import java.util.Set;

public class CollectionTest {

    /**
     * set集合
     */
    @Test
    public void test1() {
        Set<Integer> collection = new HashSet<>();

        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(1);

    }

    @Test
    public void test2() {
        MyList2<Integer> integerMyList2 = new MyList2<>();
        integerMyList2.add(66);
    }


    public class MyList2<T extends Number> {
        Object[] data;
        int size;

        public MyList2() {
            data = new Object[10];
        }

        public void add(T e) {
            data[size++] = e;
        }

        public T get(int index) {
            return (T) data[index];
        }
    }


    public class MyList<E> extends AbstractList<E> {

        private Object[] elementData;
        private int size;

        @Override
        public E get(int i) {
            return null;
        }

        @Override
        public int size() {
            return size;
        }

        public E set(int var1, E var2) {
            return null;
        }

        public void add(int var1, E var2) {

        }

        public E remove(int var1) {
            return null;
        }
    }
}
