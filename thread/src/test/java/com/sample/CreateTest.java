package com.sample;

import org.junit.Test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CreateTest {

    /**
     * 最简单的创建线程
     */
    @Test
    public void test1() {


        new Thread(() -> System.out.println("name:" + Thread.currentThread().getName() + ",id:" + Thread.currentThread().getId())).start();

        /**
         * 匿名内部类
         */
        new Thread() {
            @Override
            public void run() {
                System.out.println("name:" + Thread.currentThread().getName() + ",id:" + Thread.currentThread().getId());
            }
        }.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 利用ThreadFactory
     */
    @Test
    public void test2() {
        ThreadFactory factory = Thread::new;
        factory.newThread(() -> System.out.println("name:" + Thread.currentThread().getName() + ",id:" + Thread.currentThread().getId())).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test3() {
        ThreadFactory factory = Executors.defaultThreadFactory();
        factory.newThread(() -> System.out.println("name:" + Thread.currentThread().getName() + ",id:" + Thread.currentThread().getId())).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 利用executor进行创建
     */
    @Test
    public void test4() {
        Executor executor = runnable -> new Thread(runnable).start();

        executor.execute(() -> System.out.println("name:" + Thread.currentThread().getName() + ",id:" + Thread.currentThread().getId()));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 利用ExecutorService
     */
    @Test
    public void test5() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> {
            System.out.println("name:" + Thread.currentThread().getName() + ",id:" + Thread.currentThread().getId());
        });

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("shunt down start");
        executorService.shutdown();
        System.out.println("shunt down end.");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 通过ThreadPoolExecutor
     */
    @Test
    public void test6() {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("name:" + Thread.currentThread().getName() + ",id:" + Thread.currentThread().getId());
            }
        });

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
