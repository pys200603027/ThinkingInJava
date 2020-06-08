package com.sample.android.tree;

/**
 * 节点设计
 */
public class Node {

    private Object data;

    private Node left;
    private Node right;


    public Node(Object data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public Node setLeft(Node left) {
        this.left = left;
        return this;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public Node getRight() {
        return right;
    }

    public Node setRight(Node right) {
        this.right = right;

        return this;
    }
}
