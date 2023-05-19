package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex17_CounterRunner {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        RunCounter rc0 = new RunCounter(c, 100000);
        RunCounter rc1 = new RunCounter(c, 100000);
        RunCounter rc2 = new RunCounter(c, 100000);

        System.out.printf("Running counters...%n");

        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(rc0);
        executor.execute(rc1);
        executor.execute(rc2);

        executor.shutdown();

        System.out.printf("Waiting for counters to finish...%n");
        executor.awaitTermination(1, TimeUnit.MINUTES);

        System.out.printf("Final value: %d%n", c.value());
    }
}
