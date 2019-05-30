package com.example.linkedlist.single;

import com.example.linkedlist.Node;

/**
 * 往头部添加数据
 */
public class SingleLinkedList {
    private int size;
    private Node head;

    public SingleLinkedList() {
        size = 0;
        head = null;
    }

    /**
     * 头部添加元素
     *
     * @param obj
     * @return
     */
    public Object addHead(Object obj) {
        Node newHead = new Node(obj);
        if (size == 0) {
            head = newHead;
        } else {
            newHead.setNext(head);
            head = newHead;
        }
        size++;
        return obj;
    }

    /**
     * 删除头部元素
     *
     * @return
     */
    public Object deleteHead() {
        if (head == null) {
            return null;
        }

        Object data = head.getData();
        head = head.getNext();

        size--;
        return data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void diplay() {
        if (size == 0) {
            System.out.println("[]");
            return;
        }
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
    }
}
