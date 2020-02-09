package com.sample.android.thread.readwrite;

public class ReadWriteLock {

    /**
     * 实际正在读取的线程个数
     */
    private int readingReaders = 0;
    /**
     * 正在等待写入的线程个数
     */
    private int waitingWriters = 0;

    /**
     * 实际正在写入中的线程个数
     */
    private int writingWriters = 0;

    private boolean preferWriter = true;

    public synchronized void readLock() throws InterruptedException {
        /**
         * 有正在写入的线程，或者等待写入的线程
         */
        while (writingWriters > 0 || (preferWriter && waitingWriters > 0)) {
            wait();
        }

        readingReaders++;
    }

    public synchronized void readUnlock() {
        readingReaders--;
        preferWriter = true;
        notifyAll();
    }

    public synchronized void writeLock() throws InterruptedException {
        waitingWriters++;

    }
}

