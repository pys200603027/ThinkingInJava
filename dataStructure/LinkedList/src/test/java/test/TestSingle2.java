package test;

import com.example.linkedlist.single.SingleLinkedList2;

import org.junit.Test;

public class TestSingle2 {

    @Test
    public void test1() {
        SingleLinkedList2 singleLinkedList2 = new SingleLinkedList2();
        singleLinkedList2.add("A");
        singleLinkedList2.display();
    }

    @Test
    public void test2() {
        SingleLinkedList2 singleLinkedList2 = new SingleLinkedList2();
        singleLinkedList2.add("A");
        singleLinkedList2.add("B");
        singleLinkedList2.add("C");
        singleLinkedList2.add("D");
        singleLinkedList2.add("E");
        singleLinkedList2.display();
    }

    @Test
    public void test3() {
        SingleLinkedList2 singleLinkedList2 = new SingleLinkedList2();
        singleLinkedList2.display();
    }
}
