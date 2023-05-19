package org.example;

public class SignalT1 implements Runnable {
    Object signal;

    @Override
    public void run() {
        System.out.println("T1: Going to wait");
        synchronized (signal) {
            try {
                signal.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("T1: I am back");
    }
}

