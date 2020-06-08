package com.example.linkedlist;

public class Node {
    private Object data;
    private Node next;
    private Node prev;

    public Node(Object data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Object getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    @Override
    public String toString() {
        return "obj:" + data;
    }
}
