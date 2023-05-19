package org.example;

import java.util.Random;

class PrintThread extends Thread {
    private int sleepTime;

    public PrintThread(String name) {
        super(name);

        Random rand = new Random();
        this.sleepTime =  rand.nextInt(5000);
    }

    @Override
    public void run() {
        System.out.printf("%s: going to sleep for %d milliseconds%n", this.getName(), sleepTime);

        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }

        System.out.printf("%s: woke up and finished executing%n", this.getName());
    }
}