package com.example.linkedlist.dble;

import com.example.linkedlist.Node;

public class DoublePointLinkedList2 {

    private Node head;
    private Node tail;


    /**
     * 单纯构造一个链表
     */
    public void buildOneTwoThree() {

        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);


        one.setPrev(null);
        one.setNext(two);

        two.setPrev(one);
        two.setNext(three);

        three.setPrev(two);
        three.setNext(null);

        head = one;
        tail = three;
    }

    public int getLength() {
        Node current = head;
        int len = 0;

        while (current != null) {
            len++;
            current = current.getNext();
        }
        return len;
    }

    public void addToHead(Node node) {

        if (head == null) {
            head = node;
            tail = node;
        } else {

            Node temp = head;
            temp.setPrev(node);

            node.setNext(temp);
            node.setPrev(null);
            head = node;
        }
    }

    public void addToTail(Node node) {
        if (tail == null) {
            head = node;
            tail = node;
        } else {

            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
        }
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }
}
