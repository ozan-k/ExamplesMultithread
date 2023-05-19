package org.example;

public class Ex18_MemoryConsistencyErrorDemo {
    public static void main(String[] args) {
        Accumulator a = new Accumulator();
        Adder adder = new Adder(a);
        Printer printer = new Printer(a);

        Thread tt1 = new Thread(adder);
        Thread tt2 = new Thread(printer);

        tt1.start();
        tt2.start();
    }
}
