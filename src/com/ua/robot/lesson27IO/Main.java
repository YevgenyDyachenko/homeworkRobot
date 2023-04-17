package com.ua.robot.lesson27IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String PATH = "resources" + File.separator + "lesson27" + File.separator + "text.txt";
        Scanner scanner = new Scanner(System.in);

        try {
            ReadWrite.writeToFile(PATH, scanner.nextLine());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        ReadWrite.readFromFile(PATH);

        ReadWrite.readFromFileSecondMethod(PATH);

    }
}
