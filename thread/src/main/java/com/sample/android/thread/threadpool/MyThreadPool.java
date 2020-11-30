package com.sample.android.thread.threadpool;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyThreadPool {

    public static Executor getExecutor() {
        return new ThreadPoolExecutor(2, 3, 60, TimeUnit.SECONDS, new LinkedBlockingDeque<>(8), Executors.defaultThreadFactory());
    }
}
