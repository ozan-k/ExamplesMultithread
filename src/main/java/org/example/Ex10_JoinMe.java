package org.example;

public class Ex10_JoinMe {
    public static void main(String[] args) throws InterruptedException {
        JoinMe joinMe = new JoinMe();
        Thread tt1 = new Thread(joinMe);
        tt1.start();
        System.out.println("Main thread continues to run.");
    }
}
