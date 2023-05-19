package org.example;

public class JoinMe implements Runnable {
    @Override
    public void run() {
        System.out.println("Started thread JoinMe");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
        System.out.println("Ended thread JoinMe");
    }
}