package test;

import com.example.linkedlist.single.SingleLinkedList;

import org.junit.Test;

public class TestSingle {

    @Test
    public void test1() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addHead("A");
        singleLinkedList.diplay();
    }

    @Test
    public void test2() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.diplay();
    }

    @Test
    public void test3() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addHead("A");
        singleLinkedList.addHead("B");
        singleLinkedList.addHead("C");
        singleLinkedList.addHead("D");
        singleLinkedList.addHead("E");
        singleLinkedList.addHead("F");
        singleLinkedList.diplay();

        System.out.println(singleLinkedList.isEmpty());
    }
}
