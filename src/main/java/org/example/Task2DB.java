package org.example;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

public class Task2DB implements Runnable {
    Lock a;
    Lock b;

    public Task2DB(Lock a, Lock b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        try {
            if (b.tryLock(3000, TimeUnit.MILLISECONDS)) {
                System.out.println("Task2: Acquired lock B");
                Thread.sleep(2000);
                if (a.tryLock(3000, TimeUnit.MILLISECONDS)) {
                    System.out.println("Task2: Acquired lock A");
                    Thread.sleep(2000);
                    a.unlock();
                    System.out.println("Task2: Released lock A");
                } else {
                    System.out.println("Task2: Lock attempt on A timed out");
                }
                b.unlock();
                System.out.println("Task2: Released lock B");
            } else {
                System.out.println("Task2: Lock attempt on B timed out");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}