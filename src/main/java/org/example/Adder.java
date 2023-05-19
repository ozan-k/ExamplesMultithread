package org.example;

class Adder implements Runnable {
    Accumulator a = null;

    public Adder(Accumulator a) { this.a = a; }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            int nextValue = a.getValue() + 1;
            a.setValue(nextValue);
            System.out.println(a.getValue());
        }
    }
}
