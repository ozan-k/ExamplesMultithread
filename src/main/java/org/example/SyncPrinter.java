package org.example;

class SyncPrinter implements Runnable {
    Accumulator a;

    public SyncPrinter(Accumulator a) {
        this.a = a;
    }

    @Override
    public void run() {
        synchronized (a){
            System.out.println("Printer:" + a.getValue());
            System.out.println("Printer:" + a.getValue());
        }
    }
}