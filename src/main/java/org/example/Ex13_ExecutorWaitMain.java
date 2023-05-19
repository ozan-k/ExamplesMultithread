package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex13_ExecutorWaitMain {
    public static void main(String[] args) throws InterruptedException {
        System.out.printf("%s: Starting executor%n", Thread.currentThread().getName());

        PrintTask task1 = new PrintTask("Task1");
        PrintTask task2 = new PrintTask("Task2");
        PrintTask task3 = new PrintTask("Task3");

        ExecutorService executor = Executors.newCachedThreadPool();

        executor.execute(task1);
        executor.execute(task2);
        executor.execute(task3);

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        System.out.printf("%s: Executor terminated%n", Thread.currentThread().getName());
    }
}
