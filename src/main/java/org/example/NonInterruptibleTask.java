package org.example;

class NonInterruptibleTask implements Runnable {
    @Override
    public void run() {
        System.out.printf("Non-interruptible task: running...%n");
        for (int i = 0; i < 100; i++) {
            System.out.printf("Non-interruptible task: %d%n", i);
        }
        System.out.printf("Non-interruptible task: terminated%n");
    }
}
