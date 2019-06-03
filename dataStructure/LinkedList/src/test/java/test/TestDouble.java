package test;

import com.example.linkedlist.dble.DoublePointLinkedList;
import com.example.linkedlist.dble.QueueLinkedList;
import com.example.linkedlist.dble.TwoWayLinkedList;

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

    /**
     * 双向链表
     */
    @Test
    public void test4() {
        TwoWayLinkedList wayLinkedList = new TwoWayLinkedList();
        wayLinkedList.addHead("A");
        wayLinkedList.addHead("B");
        wayLinkedList.addHead("C");
        wayLinkedList.addHead("D");
        wayLinkedList.addTail("Z");
        wayLinkedList.addTail("X");
        wayLinkedList.addTail("V");

        wayLinkedList.display();

        wayLinkedList.deleteHead();
        wayLinkedList.display();

        wayLinkedList.deleteTail();
        wayLinkedList.display();
    }
}
