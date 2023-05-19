package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex19_SolvingThreadInterference {
    public static void main(String[] args) throws InterruptedException {
        SyncCounter c = new SyncCounter();
        RunSyncCounter rc0 = new RunSyncCounter(c, 100000);
        RunSyncCounter rc1 = new RunSyncCounter(c, 100000);
        RunSyncCounter rc2 = new RunSyncCounter(c, 100000);

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
