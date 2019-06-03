package com.example.linkedlist.order;

/**
 * 带顺序的链表
 */
public class OrderLinkedList {
    private Node head;

    public OrderLinkedList() {
        head = null;
    }

    /**
     * 从小到大的顺序排列
     *
     * @param value
     */
    public void insert(int value) {
        Node node = new Node(value);
        Node pre = null;
        Node current = head;

        while (current != null && value > current.data) {
            //记录了前面
            pre = current;
            current = current.next;
        }

        if (pre == null) {
            head = node;
            node.next = current;
        } else {
            pre.next = node;
            node.next = current;
        }
    }

    public void deleteHead() {
        head = head.next;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current);
            current = current.next;
        }

        System.out.println();
    }

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "" + data;
        }
    }
}
