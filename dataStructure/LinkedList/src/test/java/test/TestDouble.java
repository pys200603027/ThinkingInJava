package test;

import com.example.linkedlist.dble.DoublePointLinkedList;
import com.example.linkedlist.dble.QueueLinkedList;

import org.junit.Test;

public class TestDouble {

    /**
     * 添加
     */
    @Test
    public void test1() {
        DoublePointLinkedList doublePointLinkedList = new DoublePointLinkedList();
        doublePointLinkedList.addHead("A");
        doublePointLinkedList.addTail("B");
        doublePointLinkedList.addTail("A");

        doublePointLinkedList.display();
    }

    /**
     * 删除
     */
    @Test
    public void test2() {
        DoublePointLinkedList doublePointLinkedList = new DoublePointLinkedList();
        doublePointLinkedList.addHead("A");
        doublePointLinkedList.addTail("B");
        doublePointLinkedList.addTail("A");

        doublePointLinkedList.display();

        doublePointLinkedList.deleteHead();
        doublePointLinkedList.display();
    }


    /**
     * 队列测试
     */
    @Test
    public void test3() {
        QueueLinkedList queueLinkedList = new QueueLinkedList();
        queueLinkedList.insert("A");
        queueLinkedList.insert("B");
        queueLinkedList.insert("C");
        queueLinkedList.insert("D");

        queueLinkedList.display();


        queueLinkedList.delete();
        queueLinkedList.display();
    }
}
