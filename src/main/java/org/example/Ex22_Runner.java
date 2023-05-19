package org.example;

public class Ex22_Runner {
    public static void main(String[] args) {
        Object signal = new Object();
        SignalT1 t1 = new SignalT1();
        t1.signal = signal;
        SignalT2 t2 = new SignalT2();
        t2.signal = signal;
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        th1.start();
        th2.start();
    }
}
