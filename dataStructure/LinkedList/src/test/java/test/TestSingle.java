package test;

import com.example.linkedlist.Node;
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

    /**
     * 测试删除 header
     */
    @Test
    public void test4() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addHead("A");
        singleLinkedList.addHead("B");
        singleLinkedList.addHead("C");
        singleLinkedList.addHead("D");
        singleLinkedList.addHead("E");
        singleLinkedList.addHead("F");
        singleLinkedList.diplay();

        singleLinkedList.deleteHead();
        singleLinkedList.diplay();
    }

    @Test
    public void test5() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addHead("A");
        singleLinkedList.addHead("B");
        singleLinkedList.addHead("C");

        Node node = singleLinkedList.find("B");
        System.out.println(node);
    }

    @Test
    public void test6() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addHead("A");
        singleLinkedList.addHead("B");
        singleLinkedList.addHead("C");

        Node node = singleLinkedList.find("D");
        System.out.println(node);
    }

}
