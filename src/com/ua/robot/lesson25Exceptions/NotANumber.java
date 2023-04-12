package com.ua.robot.lesson25Exceptions;

public class NotANumber extends RuntimeException {
    void message(){

        System.out.println("Not a number");
    }
}
