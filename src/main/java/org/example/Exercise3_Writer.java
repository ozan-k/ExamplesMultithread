package org.example;

public class Exercise3_Writer implements Runnable{
    private int[] numbers;
    private int index;
    private int value;
    public Exercise3_Writer(int[] numbers,int index,int value){
        this.numbers = numbers;
        this.index = index;
        this.value = value;
    }
    @Override
    public void run() {
        synchronized (numbers) {
            numbers[index] = value;
        }
    }
}
