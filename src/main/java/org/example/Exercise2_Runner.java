package org.example;

public class Exercise2_Runner {
    public static void main(String[] args) {
        Person p = new Person();
        //Exercise2_T1 t1 = new Exercise2_T1();
        Exercise2_T1_Sync t1 = new Exercise2_T1_Sync();
        t1.p = p;
        //Exercise2_T2 t2 = new Exercise2_T2();
        Exercise2_T2_Sync t2 = new Exercise2_T2_Sync();
        t2.p = p;
        Thread tt1 = new Thread(t1);
        Thread tt2 = new Thread(t2);
        tt1.start();
        tt2.start();
    }
}
