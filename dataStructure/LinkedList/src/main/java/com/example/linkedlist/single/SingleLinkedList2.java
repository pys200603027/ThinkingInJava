package com.example.linkedlist.single;

import com.example.linkedlist.Node;

/**
 * 往尾部添加元素
 */
public class SingleLinkedList2 {

    private int size;
    private Node head;

    public SingleLinkedList2() {
        size = 0;
        head = null;
    }

    public Object add(Object obj) {
        Node newNode = new Node(obj);
        if (head == null) {
            head = newNode;
        } else if (head.getNext() == null) {
            head.setNext(newNode);
        } else {
            Node temp = head.getNext();
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
        size++;
        return obj;
    }

    public void display() {
        if (size == 0) {
            System.out.println("[]");
            return;
        }

        int tempSize = size;
        Node node = head;
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
    }

}
