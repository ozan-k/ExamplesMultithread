package org.example;

class RunSyncCounter implements Runnable {
    SyncCounter c;
    int times;

    public RunSyncCounter(SyncCounter c, int times) {
        this.c = c;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            c.increment();
        }
    }
}