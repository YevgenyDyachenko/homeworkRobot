package com.ua.robot.lesson03;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Arithmetics {

    public static boolean isValidUsername(String name)
    {

        String regex = "^[A-Za-z]\\w{2,29}$";

        Pattern p = Pattern.compile(regex);

        if (name == null) {
            return false;
        }

        Matcher m = p.matcher(name);

        return m.matches();
    }

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name, please:");

        String nameInput = scanner.nextLine();
        String name;

        if (isValidUsername(nameInput)) name = nameInput;
        else {

            while(!isValidUsername(nameInput)) {
                System.out.println("Please, enter a correct name");
                nameInput = scanner.nextLine();

            }
            name= nameInput;
        }

        File log = new File("log.txt");
        FileWriter fr = new FileWriter(log, true);

        Date date = new Date();

        fr.write(date + "\n");
        fr.write(name + "\n");
        fr.close();

        System.out.printf("%s, enter your first number:%n", name);
        while(!scanner.hasNextInt()) {
            System.out.println("Please, enter an integer number");
            scanner.next();
        }
        int a = scanner.nextInt();
        System.out.println("Enter your second number:");
        while(!scanner.hasNextInt()) {
            System.out.println("Please, enter an integer number");
            scanner.next();
        }
        int b = scanner.nextInt();

        scanner.close();
        System.out.println();

        String addition = "Addition of your numbers will give:           " + (a + b);
        String subtraction = "Subtracting the second number from the first: " + (a - b);
        String multiplication = "Multiplication of two numbers:                " + (a * b);
        String division = "Division of the first number by the second:   ";

        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);

        System.out.print(division);
        System.out.printf("%4.2f%n", (double)a / (double)b);


        FileWriter writer = new FileWriter("result.txt");
        writer.write("Name:                                         " + name + "\n");
        writer.write("Number #1:                                    " + a + "\n");
        writer.write("Number #2:                                    " + b + "\n");
        writer.write(addition + "\n");
        writer.write(subtraction+ "\n");
        writer.write(multiplication+ "\n");
        writer.write(division + (double)a / (double)b);

        writer.close();
        System.out.println("The result has been written to result.txt");


    }
}
