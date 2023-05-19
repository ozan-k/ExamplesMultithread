package org.example;

public class Mutex {
    private boolean locked = false;

    public void lock(){
        if (locked == true){
            throw new RuntimeException("unexpected mutex value");
        }
        locked = true;
    }

    public void unlock(){
        if (locked == false){
            throw new RuntimeException("unexpected mutex value");
        }
        locked = false;
    }

    public boolean isLocked(){
        return locked;
    }
}
