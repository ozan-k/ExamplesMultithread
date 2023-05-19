package org.example;

public class Ex24_DeadLockBasic {
    public static void main(String[] args) {
        Object a = new Object();
        Object b = new Object();

        Thread th1 = new Thread(new Task1(a, b));
        Thread th2 = new Thread(new Task2(a, b));

        th1.start();
        th2.start();
    }
}