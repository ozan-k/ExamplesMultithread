package org.example;

public class Ex21_WaitNotifyRunner {
    public static void main(String[] args) {
        CharacterData m = new CharacterData();

        CharacterGenerator producer = new CharacterGenerator();
        producer.m = m;
        CharacterPrinter processor = new CharacterPrinter();
        processor.m = m;

        Thread th1 = new Thread(producer);
        Thread th2 = new Thread(processor);

        th1.start();
        th2.start();
    }
}
