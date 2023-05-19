package org.example;

class Printer implements Runnable {
    Accumulator a;

    public Printer(Accumulator a) { this.a = a; }

    @Override
    public void run() {

        System.out.println("Printer:" + a.getValue());
        System.out.println("Printer:" + a.getValue());
    }
}
