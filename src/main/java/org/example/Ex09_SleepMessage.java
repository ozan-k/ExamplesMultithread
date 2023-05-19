package org.example;

public class Ex09_SleepMessage {
    public static void main(String args[]) throws InterruptedException {
        String message[] = {
                "message 1, ",
                "message 2, ",
                "message 3, ",
                "message 4, ",
                "message 5."
        };

        for (int i = 0; i < message.length; i++) {
            System.out.println(message[i]);
            Thread.sleep(2000);
        }
    }
}
