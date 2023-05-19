package org.example;

import java.util.Arrays;

public class CharacterPrinter implements Runnable {
    CharacterData m;

    @Override
    public void run() {
        try {
            while (true) {
                if (m.getCharacters().length == 0) {
                    System.out.println("Printer: Nothing for me to print, I'll try again later.");
                } else {
                    System.out.println("Printer: I found some characters: " + Arrays.toString(m.getCharacters()));
                    String[] emptyArray = {};
                    m.setCharacters(emptyArray);
                }
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
