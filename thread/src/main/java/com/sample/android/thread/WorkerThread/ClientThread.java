package com.sample.android.thread.WorkerThread;

/**
 * 用于生成request，不断往Channel中灌入输入请求
 */
public class ClientThread extends Thread {

    private Channel channel;

    public ClientThread(String s, Channel channel) {
        super(s);
        this.channel = channel;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; true; i++) {
                Request request = new Request(getName(), i);
                channel.putRequest(request);
                Thread.sleep(1000);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
