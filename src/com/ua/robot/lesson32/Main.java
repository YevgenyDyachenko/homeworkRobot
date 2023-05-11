package com.ua.robot.lesson32;

public class Main {

    public static void main(String[] args) {
        PrintNumbers num = new PrintNumbers();
        Thread first = new Thread(num);
        Thread second = new Thread(num);

        first.start();

//        try {
//            first.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        second.start();



    }

}