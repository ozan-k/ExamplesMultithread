package org.example;

class RunCounter implements Runnable {
    Counter c;
    int times;

    public RunCounter(Counter c, int times) {
        this.c = c;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i=0; i<times; i++){
            c.increment();
        }
    }
}
