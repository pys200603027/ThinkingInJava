package com.example.linkedlist.dble;

/**
 * 双端链表实现队列
 */
public class QueueLinkedList {
    private DoublePointLinkedList doublePointLinkedList;

    public QueueLinkedList() {
        doublePointLinkedList = new DoublePointLinkedList();
    }

    public void insert(Object obj) {
        doublePointLinkedList.addTail(obj);
    }

    public void delete() {
        doublePointLinkedList.deleteHead();
    }

    public boolean isEmpty() {
        return doublePointLinkedList.isEmpty();
    }

    public int getSize() {
        return doublePointLinkedList.getSize();
    }

    public void display() {
        doublePointLinkedList.display();
    }
}
