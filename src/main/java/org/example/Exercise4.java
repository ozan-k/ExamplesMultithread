package org.example;

public class Exercise4 {
    public static void main(String[] args) {
        Person father = new Person();
        Person son = new Person();

        Thread th1 = new Thread(new Exercise4_Tran1(father,son));
        Thread th2 = new Thread(new Exercise4_Tran2(father,son));

        th1.start();
        th2.start();
    }
}
