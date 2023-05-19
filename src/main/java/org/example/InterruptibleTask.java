package org.example;

class InterruptibleTask implements Runnable {
    @Override
    public void run() {
        System.out.printf("Interruptible task: running...%n");
        for (int i = 0; i < 10000; i++) {
            System.out.printf("Interruptible task: %d%n", i);
            if(Thread.interrupted()){
                System.out.println("Interruptible task: I was told to stop");
                return;
            }
        }
        System.out.printf("Interruptible task: terminated%n");
    }
}