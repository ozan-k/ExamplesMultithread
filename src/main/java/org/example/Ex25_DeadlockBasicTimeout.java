package org.example;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ex25_DeadlockBasicTimeout {
    public static void main(String[] args) {
        Lock a = new ReentrantLock();
        Lock b = new ReentrantLock();

        Thread th1 = new Thread(new Task1DB(a, b));
        Thread th2 = new Thread(new Task2DB(a, b));

        th1.start();
        th2.start();
    }
}
