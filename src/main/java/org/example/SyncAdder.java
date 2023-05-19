package org.example;

class SyncAdder implements Runnable {
    Accumulator a = null;

    public SyncAdder(Accumulator a) {
        this.a = a;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (a){
                int nextValue = a.getValue() + 1;
                a.setValue(nextValue);
                System.out.println(a.getValue());
            }
        }
    }
}
