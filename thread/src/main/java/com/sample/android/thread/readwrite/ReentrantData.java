package com.sample.android.thread.readwrite;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 利用ReentrantReadWriteLock进行读写锁操作 (读/写冲突，写/写冲突)
 */
public class ReentrantData {

    /**
     * 读写锁（关键点）
     */
    private ReadWriteLock lock = new ReentrantReadWriteLock();

    private String buffer;

    public String read() {

        Lock readLock = this.lock.readLock();
        readLock.lock();
        try {
            return buffer;
        } finally {
            readLock.unlock();
        }
    }

    public void write(String writer) {
        Lock writeLock = this.lock.writeLock();
        writeLock.lock();
        try {
            buffer = writer;
        } finally {
            writeLock.unlock();
        }
    }
}
