package org.example;

class Task2 implements Runnable {
    Object a;
    Object b;

    public Task2(Object a, Object b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        synchronized (b) {
            System.out.println("Task2: Acquired lock " +
                    "of 'Object b'");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (a) {
                System.out.println("Task2: Acquired lock " +
                        "of 'Object a'");
            }
        }
    }
}