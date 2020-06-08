package com.example.linkedlist.stanford;

/**
 * 简单的单链表节点
 *
 * @param <T>
 */
public class Node<T> {

    T data;
    Node next;

    public Node() {
    }

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public Node<T> setData(T data) {
        this.data = data;
        return this;
    }

    public Node getNext() {
        return next;
    }

    public Node<T> setNext(Node next) {
        this.next = next;
        return this;
    }
}
