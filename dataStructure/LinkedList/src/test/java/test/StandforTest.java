package test;

import com.example.linkedlist.stanford.Node;
import com.example.linkedlist.stanford.StanfordLinkList;

import org.junit.Test;

public class StandforTest {

    @Test
    public void test1() {
        StanfordLinkList linkList = new StanfordLinkList();
        linkList.buildOneTwoThree();
        System.out.println(linkList.getLength());
    }

    /**
     * 测试 Push ，从头添加
     */
    @Test
    public void test2() {
        StanfordLinkList linkList = new StanfordLinkList();

        linkList.push(new Node<Integer>(1));
        linkList.push(new Node<Integer>(2));
        linkList.push(new Node<Integer>(3));


        Node head = linkList.getHead();
        Node current = head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    @Test
    public void test3() {
        StanfordLinkList linkList = new StanfordLinkList();
        linkList.push2(new Node<Integer>(1));
        linkList.push2(new Node<Integer>(2));
        linkList.push2(new Node<Integer>(3));

        Node head = linkList.getHead();
        Node current = head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    @Test
    public void test4() {
        StanfordLinkList linkList = new StanfordLinkList();

        linkList.push3(new Node<Integer>(1));
        linkList.push3(new Node<Integer>(2));
        linkList.push3(new Node<Integer>(3));
        linkList.push3(new Node<Integer>(4));
        linkList.push3(new Node<Integer>(5));
        linkList.push3(new Node<Integer>(6));

        Node current = linkList.getHead();
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    @Test
    public void test5() {
        StanfordLinkList linkList = new StanfordLinkList();
        linkList.appendNode(new Node<Integer>(1));
        linkList.appendNode(new Node<Integer>(2));
        linkList.appendNode(new Node<Integer>(3));
        linkList.appendNode(new Node<Integer>(4));
        linkList.appendNode(new Node<Integer>(5));

        Node current = linkList.getHead();

        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    @Test
    public void test6() {
        StanfordLinkList linkList = new StanfordLinkList();

        linkList.push(new Node<Integer>(1));
        linkList.push(new Node<Integer>(2));
        linkList.push(new Node<Integer>(3));
        linkList.push(new Node<Integer>(4));
        linkList.push(new Node<Integer>(5));

        Node head = linkList.getHead();
        Node current = head;
        while (current != null) {
            System.out.print(current.getData());
            current = current.getNext();
        }
        System.out.println();

        Node newHead = linkList.reverseList(linkList.getHead());
        while (newHead != null) {
            System.out.print(newHead.getData());
            newHead = newHead.getNext();
        }
    }

    @Test
    public void test7() {
        StanfordLinkList linkList = new StanfordLinkList();
        linkList.push4(new Node(1));
        linkList.push4(new Node(2));
        linkList.push4(new Node(3));
        linkList.push4(new Node(4));
        linkList.push4(new Node(5));


        Node current = linkList.getHead();
        while (current != null) {
            System.out.print(current.getData());
            current = current.getNext();
        }
    }

    @Test
    public void test8() {
        StanfordLinkList linkList = new StanfordLinkList();
        linkList.push(new Node(5));
        linkList.push(new Node(4));
        linkList.push(new Node(3));
        linkList.push(new Node(2));
        linkList.push(new Node(1));

        print(linkList.getHead());

        linkList.reverseList2(linkList.getHead());
        print(linkList.getHead());

    }


    public void print(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData());
            current = current.getNext();
        }

        System.out.println();
    }
}
