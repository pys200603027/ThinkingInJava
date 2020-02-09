package com.sample;

import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class CollectionTest {

    /**
     * 测试current中的集合
     * 以来wait中的InterruptException进行阻断并不可靠，如果线程都在工作，很可能线程不会都进入wait，导致无法中断
     */
    @Test
    public void test1() {

        /**
         * 需要指定大小
         */
//        final BlockingQueue blockingQueue = new ArrayBlockingQueue(20);

        /**
         * 以队列的形式进行的，无限制大小的集合
         */
        final BlockingQueue blockingQueue = new LinkedBlockingQueue<>();

        /**
         * 带优先级的队列(通过Comparable)接口进行
         */
//        final BlockingQueue blockingQueue = new PriorityBlockingQueue();


        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        threadPool.submit(() -> {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    blockingQueue.put(new Object());
                    System.out.println("Thread:" + Thread.currentThread().getName() + ",put ok");
//                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Thread name:" + Thread.currentThread().getName() + "," + e.getMessage());
            }

        });

        Runnable take = () -> {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    Object take1 = blockingQueue.take();
                    System.out.println("Thread:" + Thread.currentThread().getName() + ",take ok");
//                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Thread name:" + Thread.currentThread().getName() + "," + e.getMessage());
            }
        };

        //仅仅有两个线程分别进行take/put的话，比较难出现wait的情况
        threadPool.submit(take);
//        threadPool.submit(take);


        try {
            Thread.sleep(1000);
            threadPool.shutdownNow();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
