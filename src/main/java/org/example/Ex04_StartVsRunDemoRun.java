package org.example;

public class Ex04_StartVsRunDemoRun {
    public static void main(String[] args) {
        System.out.printf("%s: Starting ThreadMain%n",
                Thread.currentThread().getName());

        PrintTask task0 = new PrintTask("Task0");
        PrintTask task1 = new PrintTask("Task1");
        PrintTask task2 = new PrintTask("Task2");

        task0.run();
        task1.run();
        task2.run();

        System.out.printf("%s: ThreadMain terminated%n",
                Thread.currentThread().getName());
    }
}
