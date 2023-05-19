package org.example;

public class Exercise2_T1 implements Runnable {
    public Person p = null;

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                p.setName("Rick");
                Thread.sleep(10);
                p.setSurname("Sanchez");
                Thread.sleep(10);
                p.setAge(60);

                Thread.sleep(10);
                p.setName("Morty");
                Thread.sleep(10);
                p.setSurname("Smith");
                Thread.sleep(10);
                p.setAge(14);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
