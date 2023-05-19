package org.example;

import java.util.Random;

public class PrintTask implements Runnable {
    private final String name;
    private final int sleepTime;

    public PrintTask(String name) {
        this.name = name;
        this.sleepTime = (new Random()).nextInt(5000);
    }

    @Override
    public void run() {
        System.out.printf("%s: I'm going to sleep for %d milliseconds.%n", name, sleepTime);

        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }

        System.out.printf(
                "%s: I woke up and finished executing.%n", name);
    }
}