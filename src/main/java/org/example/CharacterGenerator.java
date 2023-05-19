package org.example;

import java.util.Random;

public class CharacterGenerator implements Runnable {
    CharacterData m;
    Random rand = new Random();

    @Override
    public void run() {
        try {
            while (true) {
                if (m.getCharacters().length == 0) {
                    int sleepTime = rand.nextInt(10000);
                    System.out.printf("Generator: I need to create some characters... (%d)%n", sleepTime);
                    Thread.sleep(sleepTime);
                    String[] newCharacters = {"Rick", "Morty", "Summer", "Beth"};
                    System.out.println("Generator: My characters are now available!");
                    m.setCharacters(newCharacters);
                } else {
                    System.out.printf("Generator: Characters are available. I'll check again later.%n");
                }
                Thread.sleep(2000);
            }
        } catch (InterruptedException e1) {
            e1.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}