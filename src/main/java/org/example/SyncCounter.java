package org.example;

class SyncCounter {
    private int c = 0;

    synchronized public void increment() {
        c++;
    }

    synchronized public void decrement() {
        c--;
    }

    synchronized public int value() {
        return c;
    }
}