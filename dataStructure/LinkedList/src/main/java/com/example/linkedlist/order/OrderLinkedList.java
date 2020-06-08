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

        //寻找第一个比该value da的节点
        while (current != null && value > current.data) {
            //记录当前节点
            pre = current;
            current = current.next;
        }

        //如果找不到（附到header之前）
        if (pre == null) {
            head = node;
            node.next = current;
        } else {
            //如果找到了，指针重组
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
