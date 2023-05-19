package org.example;

public class SignalT2 implements Runnable {
    Object signal;

    @Override
    public void run() {
        System.out.println("T2: I'll sleep for two seconds and then notify the other thread");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (signal) {
            signal.notify();
            System.out.println("T2: I notified the other thread");
        }
    }
}
