package com.example.linkedlist;

public class Node {
    private Object data;
    private Node next;

    public Node(Object data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
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
