package org.example;

public class Ex14_CantInterrupt {
    public static void main(String[] args) throws InterruptedException {
        String threadName = Thread.currentThread().getName();
        System.out.printf("%s: Starting...%n", threadName);

        NonInterruptibleTask t = new NonInterruptibleTask();
        Thread th = new Thread(t);
        th.start();

        System.out.printf("%s: Interrupting child thread.%n", threadName);
        th.interrupt();

        System.out.printf("%s: Terminated.%n", threadName);
    }
}
