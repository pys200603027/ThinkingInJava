package com.example.linkedlist.dble;

import com.example.linkedlist.Node;

/**
 * 双向链表
 */
public class TwoWayLinkedList {


    private Node head;
    private Node tail;

    private int size;


    public void addHead(Object obj) {
        Node node = new Node(obj);
        if (size == 0) {
            head = node;
            tail = node;
        } else {
            head.setPrev(node);
            node.setNext(head);
            head = node;
        }
        size++;
    }

    public void addTail(Object obj) {
        Node node = new Node(obj);
        if (size == 0) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
        }
        size++;
    }

    public Node deleteHead() {
        Node temp = head;
        if (size != 0) {
            head = head.getNext();
            head.setPrev(null);
            size--;
        }
        return temp;
    }

    public Node deleteTail() {
        Node temp = tail;
        if (size != 0) {
            tail = tail.getPrev();
            tail.setNext(null);
            size--;
        }
        return temp;
    }

    public int getSize() {
        return size;
    }

    public void display() {
        if (size > 0) {
            Node node = head;
            int tempSize = size;

            if (tempSize == 1) {
                System.out.println("[" + node + "]");
                return;
            }

            while (tempSize > 0) {
                if (node.equals(head)) {
                    System.out.print("[" + node + "->");
                } else if (node.getNext() == null) {
                    System.out.print(node + "]");
                } else {
                    System.out.print(node + "->");
                }
                node = node.getNext();
                tempSize--;
            }
            System.out.println();
        } else {
            System.out.println("[]");
        }
    }
}
