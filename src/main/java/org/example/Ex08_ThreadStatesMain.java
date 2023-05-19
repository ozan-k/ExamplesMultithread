package org.example;

public class Ex08_ThreadStatesMain {
    public static void main(String[] args) throws InterruptedException {
        System.out.printf("%s: Starting ThreadStatesMain%n", Thread.currentThread().getName());

        PrintTask task0 = new PrintTask("Task0");
        PrintTask task1 = new PrintTask("Task1");
        PrintTask task2 = new PrintTask("Task2");

        Thread thread0 = new Thread(task0);
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        System.out.printf("%s: State: %s%n", thread0.getName(), thread0.getState());

        thread0.start();
        thread1.start();
        thread2.start();

        System.out.printf("%s: State: %s%n", thread0.getName(), thread0.getState());

        thread0.join();
        System.out.printf("%s: State: %s%n", thread0.getName(), thread0.getState());

        System.out.printf("%s: ThreadStatesMain terminated%n", Thread.currentThread().getName());
    }
}
