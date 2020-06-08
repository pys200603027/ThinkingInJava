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
        Node newNode = new Node(obj);
        newNode.setNext(head);
        head = newNode;
        size++;

        return obj;
    }

    /**
     * 这个查找
     *
     * @param obj
     * @return
     */
    public Node find(Object obj) {
        Node current = head;
        int tempSize = size;

        while (tempSize > 0) {
            if (obj.equals(current.getData())) {
                return current;
            } else {
                current = head.getNext();
            }
            tempSize--;
        }
        return null;
    }

    public Node find2(Object obj) {
        Node current = head;

        while (current != null) {
            if (obj.equals(current.getData())) {
                return current;
            }
            current = current.getNext();
        }
        return null;
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
        Node temp = head.getNext();

        //数据清除
        head.setNext(null);
        head.setData(null);
        head.setPrev(null);

        //将数据传给head
        head = temp;

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

        while (node != null) {
            if (node.equals(head)) {
                System.out.print("[" + node + "->");
            } else if (node.getNext() == null) {
                System.out.print(node + "]");
            } else {
                System.out.print(node + "->");
            }
            node = node.getNext();
        }
        System.out.println();
    }
}
