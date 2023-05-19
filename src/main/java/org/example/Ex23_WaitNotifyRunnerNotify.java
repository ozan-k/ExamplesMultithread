package org.example;


public class Ex23_WaitNotifyRunnerNotify {
    public static void main(String[] args) {
        CharacterData m = new CharacterData();

        CharacterGeneratorSignal producer = new CharacterGeneratorSignal();
        producer.m = m;
        CharacterPrinterSignal processor = new CharacterPrinterSignal();
        processor.m = m;

        Thread th1 = new Thread(producer);
        Thread th2 = new Thread(processor);

        th1.start();
        th2.start();
    }
}