package com.sample.android.thread.WorkerThread;

import java.util.Random;

public class Request {

    private String name;
    private int number;

    private static final Random random = new Random();

    public Request(String name, int number) {
        this.name = name;
        this.number = number;
    }

    //请求执行体
    public void execute() {

        System.out.println(Thread.currentThread().getName() + " executes " + this);

        try {
            Thread.sleep(random.nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "[request from " + name + ",No." + number + "]";
    }
}
