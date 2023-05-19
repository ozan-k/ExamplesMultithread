package org.example;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

class Task1DB implements Runnable {
    Lock a;
    Lock b;

    public Task1DB(Lock a, Lock b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        try {
            if (a.tryLock(8000, TimeUnit.MILLISECONDS)) {
                System.out.println("Task1: Acquired lock A");
                Thread.sleep(2000);
                if (b.tryLock(8000, TimeUnit.MILLISECONDS)) {
                    System.out.println("Task1: Acquired lock B");
                    Thread.sleep(2000);
                    b.unlock();
                    System.out.println("Task1: Released lock B");
                } else {
                    System.out.println("Task1: Lock attempt on B timed out");
                }
                Thread.sleep(2000);
                a.unlock();
                System.out.println("Task1: Released lock A");
            } else {
                System.out.println("Task1: Lock attempt on A timed out");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}