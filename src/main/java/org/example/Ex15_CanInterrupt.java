package org.example;

public class Ex15_CanInterrupt {
    public static void main(String[] args) throws InterruptedException {
        String threadName = Thread.currentThread().getName();
        System.out.printf("%s: Starting...%n", threadName);

        InterruptibleTask t = new InterruptibleTask();
        Thread th = new Thread(t);
        th.start();

        Thread.sleep(100);
        System.out.printf("%s: Interrupting child thread.%n", threadName);
        th.interrupt();

        System.out.printf("%s: Terminated.%n", threadName);
    }
}
