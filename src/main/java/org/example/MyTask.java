package org.example;

class MyTask implements Runnable {
    String name;
    boolean canGoBackToSleep;

    public MyTask(String name, boolean canGoBackToSleep) {
        this.name = name;
        this.canGoBackToSleep = canGoBackToSleep;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.printf("%s: I'm going to sleep...%n", name);
                Thread.sleep(5000);
                System.out.printf("%s: I finished sleeping. :)%n", name);
                return;
            } catch (InterruptedException e) {
                System.out.printf("%s: My sleep has been interrupted. :(%n", name);
                if (!this.canGoBackToSleep)
                    return;
            }
        }
    }
}
