package org.example;

public class Exercise1 {
    public static void main(String[] args) throws InterruptedException {
        Exercise1_T1 t1 = new Exercise1_T1();
        Exercise1_T2 t2 = new Exercise1_T2();
        Thread tt1 = new Thread(t1);
        Thread tt2 = new Thread(t2);
        tt1.start();
        tt1.join();
        tt2.start();
    }
}
