package com.example.linkedlist;

public class Node {
    private Object data;
    private Node next;
    private Node Prev;

    public Node(Object data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return Prev;
    }

    public void setPrev(Node prev) {
        Prev = prev;
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
