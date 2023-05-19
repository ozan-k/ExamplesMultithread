package org.example;

class Task1 implements Runnable {
    Object a;
    Object b;

    public Task1(Object a, Object b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        synchronized (a) {
            System.out.println("Task1: Acquired lock " +
                    "of 'Object a'");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (b) {
                System.out.println("Task1: Acquired lock " +
                        "of 'Object b'");
            }
        }
    }
}