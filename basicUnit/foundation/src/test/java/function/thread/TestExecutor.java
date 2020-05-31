package function.thread;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutor {

    /**
     * 测试线程池创建的线程
     */
    @Test
    public void test1() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            executorService.execute(() -> System.out.println(Thread.currentThread().getName()));
            try {
                Thread.sleep(500l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test2() {
        final Object obj = new Object();
        Runnable target;
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                //不加 synchronized 会抛出异常
                synchronized (obj) {
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        });

        thread.start();
    }

    class MyThread extends Thread {
        String value;

        public MyThread(String value) {
            this.value = value;

//            System.out.println(this.value == value);
        }

        @Override
        public void run() {
            String temp = value;
            System.out.println("temp equals:" + (temp == value));

//                temp = temp + i;
            value = value + "1";

            System.out.println("temp equals 2:" + (temp == value));
        }
    }


    @Test
    public void test3() {
        String value = "-1";

        for (int i = 0; i < 20; i++) {
            Thread thread = new Thread(new MyThread(value));
            thread.start();
        }


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(value);

    }

}
