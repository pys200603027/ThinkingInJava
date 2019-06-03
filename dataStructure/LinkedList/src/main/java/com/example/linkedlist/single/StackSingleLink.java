package com.example.linkedlist.single;

/**
 * 单链表实现栈
 */
public class StackSingleLink {
    private SingleLinkedList singleLinkedList;

    public StackSingleLink() {
        singleLinkedList = new SingleLinkedList();
    }

    public void push(Object obj) {
        singleLinkedList.addHead(obj);
    }

    public Object pop() {
        return singleLinkedList.deleteHead();
    }

    public boolean isEmpty() {
        return singleLinkedList.isEmpty();
    }

    public void display() {
        singleLinkedList.diplay();
    }

}
