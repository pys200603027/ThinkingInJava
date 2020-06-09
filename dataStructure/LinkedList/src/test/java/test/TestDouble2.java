package test;

import com.example.linkedlist.Node;
import com.example.linkedlist.dble.DoublePointLinkedList2;

import org.junit.Test;

public class TestDouble2 {

    @Test
    public void test1() {
        DoublePointLinkedList2 list = new DoublePointLinkedList2();
        list.buildOneTwoThree();
        System.out.println(list.getLength());
    }

    @Test
    public void test2() {
        DoublePointLinkedList2 list = new DoublePointLinkedList2();
        list.buildOneTwoThree();

        Node temp = list.getHead();

        print(temp);


        Node temp2 = list.getTail();
        while (temp2 != null) {
            System.out.print(temp2.getData());
            temp2 = temp2.getPrev();
        }
        System.out.println();
    }

    private void print(Node temp) {
        while (temp != null) {
            System.out.print(temp.getData());
            temp = temp.getNext();
        }
        System.out.println();
    }

    private void print2(Node tail) {

        while (tail != null) {
            System.out.print(tail.getData());
            tail = tail.getPrev();
        }
        System.out.println();
    }


    @Test
    public void test3() {
        DoublePointLinkedList2 list = new DoublePointLinkedList2();

        list.addToHead(new Node(1));
        list.addToHead(new Node(2));
        list.addToHead(new Node(3));
        list.addToHead(new Node(4));
        list.addToHead(new Node(5));

        print(list.getHead());
        print2(list.getTail());
    }

    @Test
    public void test4() {
        DoublePointLinkedList2 list = new DoublePointLinkedList2();

        list.addToTail(new Node(1));
        list.addToTail(new Node(2));
        list.addToTail(new Node(3));
        list.addToTail(new Node(4));
        list.addToTail(new Node(5));

        list.addToHead(new Node(0));

        print2(list.getTail());

        print(list.getHead());
    }
}
