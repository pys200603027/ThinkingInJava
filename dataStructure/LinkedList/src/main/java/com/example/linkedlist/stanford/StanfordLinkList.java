package com.example.linkedlist.stanford;

public class StanfordLinkList {

    /**
     * 头部
     */
    private Node head;

    public Node buildOneTwoThree() {

        Node<Integer> head = new Node<>();
        Node<Integer> second = new Node<>();
        Node<Integer> threee = new Node<>();

        head.setData(1).setNext(second);
        second.setData(2).setNext(threee);
        threee.setData(3).setNext(null);


        this.head = head;

        return head;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        Node current = head;
        int count = 0;

        /**
         * 遍历链表的手法
         */
        while (current != null) {
            count++;
            current = current.getNext();
        }

        return count;
    }

    /**
     * add to head
     *
     * @param node
     */
    public void push(Node node) {
        Node current = head;
        node.setNext(current);
        head = node;
    }

    /**
     * 尾部push
     *
     * @param node
     */
    public void push2(Node node) {
        if (head == null) {
            head = node;
            return;
        }

        Node tail = head;
        while (tail != null) {
            if (tail.next == null) {
                tail.next = node;
                break;
            }
            tail = tail.next;
        }
    }

    /**
     * @param node
     */
    public void push3(Node node) {
        Node dummyNode = new Node();
        dummyNode.next = head;
        Node tail = dummyNode;

        while (tail != null) {
            if (tail.next == null) {
                tail.next = node;
                break;
            }
            tail = tail.getNext();

        }

        head = dummyNode.next;
    }

    public void appendNode(Node node) {
        Node current = head;

        if (current == null) {
            head = node;
        } else {

            //定位到最后一个node
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.next = node;
        }
    }

    public void appendNode2(Node node) {
        Node current = head;

        if (current == null) {
            push(node);
        } else {

            while (current.getNext() != null) {
                current = current.getNext();
            }
        }
    }


    public Node reverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}
