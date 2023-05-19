package org.example;

public class Ex06_NamedThread {
    public static void main(String[] args) {
        String mainThreadName = Thread.currentThread().getName();
        System.out.printf("%s: Starting ThreadMain%n", mainThreadName);

        PrintTask task0 = new PrintTask("Task0");
        Thread thread0 = new Thread(task0, "my-thread");
        System.out.printf("%s: starting%n", thread0.getName());
        thread0.start();

        System.out.printf("%s: ThreadMain terminated%n", mainThreadName);
    }
}
