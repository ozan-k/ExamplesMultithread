package org.example;

public class Ex03_ExtendThread {
    public static void main(String[] args) {
        System.out.printf("%s: Starting ExtendThread%n", Thread.currentThread().getName());

        Thread thread0 = new PrintThread("Thread0");
        Thread thread1 = new PrintThread("Thread1");
        Thread thread2 = new PrintThread("Thread2");

        thread0.start();
        thread1.start();
        thread2.start();

        System.out.printf("%s: ThreadMain terminated%n", Thread.currentThread().getName());
    }
}
