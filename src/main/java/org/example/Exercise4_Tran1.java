package org.example;

public class Exercise4_Tran1 implements Runnable {

    Person father;
    Person son;

    Exercise4_Tran1(Person father, Person son) {
        this.father = father;
        this.son = son;
    }

    @Override
    public void run() {
        synchronized (father) {
            System.out.println("Tran1: locked father");
            father.money -= 100;
            System.out.println("Tran1: waiting for son to be unlocked");
            synchronized (son) {
                son.money += 100;
                System.out.println("Tran1: son has been unlocked, transferred money");
            }
        }
        System.out.println("Tran1: done");
    }
}