package org.example;

public class Exercise3 {
    public static void main(String[] args) {
        int[] data = new int[4];
        Thread tt1 = new Thread(new Exercise3_Writer(data,1,1));
        tt1.start();
        for (int i: data) {
            System.out.println(i);
        }
    }
}
