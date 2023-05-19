package org.example;

public class CharacterData {
    protected String[] characters = {};

    public synchronized String[] getCharacters() {
        return this.characters;
    }

    public synchronized void setCharacters(String[] characters) {
        this.characters = characters;
    }
}