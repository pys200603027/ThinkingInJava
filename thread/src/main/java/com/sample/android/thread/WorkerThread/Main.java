package com.sample.android.thread.WorkerThread;

public class Main {

    public static void main(String[] args) {
        Channel channel = new Channel(5);
        channel.startWorker();

        new ClientThread("Alice", channel).start();
        new ClientThread("Bobby", channel).start();
        new ClientThread("Chris", channel).start();
        new ClientThread("D", channel).start();
        new ClientThread("E", channel).start();
        new ClientThread("F", channel).start();

    }
}
