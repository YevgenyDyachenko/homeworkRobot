package com.ua.robot.lesson33;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {

            for (; ;) {
                int i = new Random().nextInt(1, 11);

                if (i == 5) {
                    Thread.currentThread().interrupt();
                    break;
                }
                System.out.println(i);

            }

        });
        thread.start();
    }
}