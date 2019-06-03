package test;

import com.example.linkedlist.order.OrderLinkedList;

import org.junit.Test;

import java.util.Random;

public class TestOrder {

    @Test
    public void test1() {
        OrderLinkedList orderLinkedList = new OrderLinkedList();
        orderLinkedList.insert(1);
        orderLinkedList.insert(3);
        orderLinkedList.insert(2);
        orderLinkedList.insert(5);

        orderLinkedList.display();
    }

    @Test
    public void test2() {
        OrderLinkedList orderLinkedList = new OrderLinkedList();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            orderLinkedList.insert(random.nextInt(100));
        }
        orderLinkedList.display();
    }
}
