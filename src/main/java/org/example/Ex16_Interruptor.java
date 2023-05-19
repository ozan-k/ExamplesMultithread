package org.example;

public class Ex16_Interruptor {
    public static void main(String[] args) throws InterruptedException {
        System.out.printf("%s: Starting...%n", Thread.currentThread().getName());

        MyTask t0 = new MyTask("Task0", true);
        Thread th0 = new Thread(t0);
        th0.start();
        Thread.sleep(2000);
        th0.interrupt();

        MyTask t1 = new MyTask("Task1", false);
        Thread th1 = new Thread(t1);
        th1.start();
        Thread.sleep(2000);
        th1.interrupt();

        System.out.printf("%s: Terminated.%n", Thread.currentThread().getName());
    }
}
