package com.sample.android.thread.WorkerThread;


public class Channel {
    private static final int MAX_REQUEST = 100;

    private Request[] requestQueue;

    private int tail;

    private int head;

    private int count;

    private WorkerThread[] threadPools;

    public Channel(int count) {
        this.count = 0;
        this.head = 0;
        this.tail = 0;
        //队列
        this.requestQueue = new Request[MAX_REQUEST];

        //线程池
        this.threadPools = new WorkerThread[count];
        for (int i = 0; i < count; i++) {
            threadPools[i] = new WorkerThread("worker " + i, this);
        }
    }

    public void startWorker() {
        for (int i = 0; i < threadPools.length; i++) {
            threadPools[i].start();
        }
    }

    public synchronized void putRequest(Request request) {
        while (count >= requestQueue.length) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        requestQueue[tail] = request;
        tail = (tail + 1) % requestQueue.length;
        count++;
        notifyAll();
    }

    public synchronized Request takeRequest() {
        while (count <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Request requests = requestQueue[head];
        head = (head + 1) % requestQueue.length;
        count--;
        notifyAll();
        return requests;
    }
}
