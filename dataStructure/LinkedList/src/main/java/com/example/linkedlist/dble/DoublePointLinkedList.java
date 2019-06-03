package com.example.linkedlist.dble;

import com.example.linkedlist.Node;

/**
 * 双端链表
 */
public class DoublePointLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoublePointLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addTail(Object obj) {
        Node newNode = new Node(obj);
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    public void addHead(Object obj) {
        Node newNode = new Node(obj);
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }

    public boolean deleteHead() {
        if (size == 0) {
            return false;
        }

        if (head.getNext() == null) {
            head = null;
            tail = null;
        } else {
            head = head.getNext();
        }
        size--;
        return true;
    }

    public boolean isEmpty() {
        return size == 0;
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
