package com.sample.android.thread.WorkerThread;

public class WorkerThread extends Thread {

    private Channel channel;

    public WorkerThread(String s, Channel channel) {
        super(s);
        this.channel = channel;
    }

    @Override
    public void run() {
        while (true) {
            Request request = channel.takeRequest();
            request.execute();
        }
    }
}
