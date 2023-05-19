package org.example;

public class Exercise4_Tran2 implements Runnable {
    Person father;
    Person son;

    Exercise4_Tran2(Person father, Person son) {
        this.father = father;
        this.son = son;
    }

    @Override
    public void run() {
        synchronized (son) {
            System.out.println("Tran2: locked son");
            son.money -= 10;
            System.out.println("Tran2: waiting for father to be unlocked");
            synchronized (father) {
                father.money += 10;
                System.out.println("Tran2: father unlocked, money transfered");
            }
        }
        System.out.println("Tran2: done");
    }
}

