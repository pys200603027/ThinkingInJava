package com.sample.android.tree;

public class Tree {

    private Node head;

    public Tree(Node head) {
        this.head = head;
    }

    public void add(Node head, Node node) {
        if (head == null) {
            head = node;
        } else if (head.getLeft() == null) {
            head.setLeft(node);
        } else if (head.getRight() == null) {
            head.setRight(node);
        } else {

            int lrh = 0;
            int rrh = 0;
            Node temp = head.getLeft();

            while (temp != null) {
                lrh++;
                temp = temp.getRight();
            }

            temp = head.getRight();

            while (temp != null) {
                rrh++;
                temp = temp.getRight();
            }

            if (lrh != rrh) {
                add(head.getRight(), node);
            } else {
                add(head.getLeft(), node);
            }
        }

    }


    /**
     * 前序
     *
     * @param node
     */
    public void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.getData());
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    /**
     * 中序
     *
     * @param node
     */
    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.getLeft());
            System.out.print(node.getData());
            inOrder(node.getRight());
        }
    }

    /**
     * 后序
     *
     * @param node
     */
    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.print(node.getData());
        }
    }
}
