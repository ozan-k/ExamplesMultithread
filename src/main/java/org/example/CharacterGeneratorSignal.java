package org.example;

import java.util.Random;

public class CharacterGeneratorSignal implements Runnable {
    CharacterData m;
    private Random rand = new Random();
    private final String[] characters = {"Rick", "Morty", "Summer", "Beth"};

    @Override
    public void run() {
        try {
            while (true) {
                synchronized (m){
                    if (m.getCharacters().length == 0) {
                        int sleepTime = rand.nextInt(10000);
                        System.out.printf("Generator: I need to create some characters... (%d)%n", sleepTime);
                        Thread.sleep(sleepTime);
                        m.setCharacters(characters);
                        System.out.println("Generator: My characters are ready to be printed!");
                        m.notify();
                    } else {
                        System.out.printf("Generator: Characters already available. I'll wait until someone notifies me.%n");
                        m.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}