package org.example;

import java.util.Arrays;

public class CharacterPrinterSignal implements Runnable {
    CharacterData m;

    @Override
    public void run() {
        try {
            while (true) {
                synchronized (m) {
                    if (m.getCharacters().length == 0) {
                        System.out.println("Printer: Nothing for me to print. I'll wait until someone notifies me.");
                        m.wait();
                    } else {
                        System.out.println("Printer: I found some characters: " + Arrays.toString(m.getCharacters()));
                        String[] emptyArray = {};
                        m.setCharacters(emptyArray);
                        m.notify();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

