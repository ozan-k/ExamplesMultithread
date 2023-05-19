package org.example;

public class Ex20_SolvingMemoryConsistencyError {
    public static void main(String[] args) {
        Accumulator a = new Accumulator();
        SyncAdder adder = new SyncAdder(a);
        SyncPrinter printer = new SyncPrinter(a);

        Thread tt1 = new Thread(adder);
        Thread tt2 = new Thread(printer);

        tt1.start();
        tt2.start();
    }
}
