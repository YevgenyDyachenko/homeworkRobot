package com.ua.robot.lesson25Exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner;

        do {
            scanner = new Scanner(System.in);
            try {
                System.out.println("Enter any number:");

                if (scanner.hasNextInt()) {

                    System.out.println("This is your number: " + scanner.nextInt());
                    break;

                } else {
                    throw new NotANumber();
                }
            } catch (NotANumber e) {
                e.message();

            }
        }while(!scanner.hasNextInt());
    }


    }



