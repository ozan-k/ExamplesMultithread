package org.example;

public class Ex11_JoinMe {
    public static void main(String[] args) throws InterruptedException {
        JoinMe joinMe = new JoinMe();
        Thread tt1 = new Thread(joinMe);
        tt1.start();
        tt1.join();
        System.out.println("Main thread continues to run.");
    }
}
