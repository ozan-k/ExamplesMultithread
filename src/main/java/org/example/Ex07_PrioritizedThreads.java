package org.example;

public class Ex07_PrioritizedThreads {
    public static void main(String[] args) {

        class T1 implements Runnable {
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                for (int i = 0; i < 30; i++)
                    System.out.printf("%s: %d%n", name, i);

                System.out.printf("%s: finalized!%n", name);
            }
        }

        Thread th1 = new Thread(new T1(), "HI");
        th1.setPriority(10);
        Thread th2 = new Thread(new T1(), "MID");
        th1.setPriority(5);
        Thread th3 = new Thread(new T1(), "LOW");
        th1.setPriority(1);

        th1.start();
        th2.start();
        th3.start();
    }
}
