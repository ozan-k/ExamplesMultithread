package org.example;

public class Exercise2_T2 implements Runnable {
    public Person p = null;

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                Thread.sleep(10);
                System.out.println("T2: " + p.toString());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}