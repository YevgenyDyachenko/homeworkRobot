package com.ua.robot.lesson04;


import java.nio.file.Files;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        Path filePath = Path.of("resources" + File.separator + "lesson4" + File.separator + "text.txt");
        String content = Files.readString(filePath);

        String text = " neW yoRk     kNIcKs ";
               text = content;
//               text = "";


        if (text.length() == 0 || text.trim().length() == 0) {
            System.out.println("\033[0;31mThe String is empty!");
            System.exit(1);
        }
        if (((int) text.charAt(0)) == 32 | ((int) text.charAt(text.length() - 1) == 32))
            text = text.trim();

        String lower = String.format("In lower case:                      %s", text.toLowerCase());
        String upper = String.format("In UPPER case:                      %s", text.toUpperCase());
        System.out.printf("%s\n%s\n", lower, upper);

        System.out.println("The firs symbol is:                 " + text.charAt(0));
        System.out.println("The last symbol is:                 " + text.charAt(text.length()-1));

        text = text.toLowerCase();

        String snake_case = text.replaceAll("\\s+", "_");
        System.out.println("An example of snake case:           " + snake_case);

        var arrOfStrings = text.split("\\s+");
        System.out.println("An array of strings:                " + Arrays.toString(arrOfStrings));

        StringBuffer camelCaseWords = new StringBuffer();
        for (int i = 0; i < arrOfStrings.length; i += 2) {
            arrOfStrings[i] = arrOfStrings[i].toUpperCase();
            camelCaseWords.append(arrOfStrings[i]);
            if (i < arrOfStrings.length - 1) camelCaseWords.append(arrOfStrings[i + 1]);
        }
        System.out.println("An example of camel case for words: " + camelCaseWords);

        StringBuilder camelCase = new StringBuilder();
        for (int i = 0; i < arrOfStrings.length; i++) {
            arrOfStrings[i] = arrOfStrings[i].substring(0, 1).toUpperCase() +
                    arrOfStrings[i].substring(1).toLowerCase();
            camelCase.append(arrOfStrings[i]);
        }
        System.out.println("An example of camel case:           " + camelCase);

        text = camelCase.toString().toLowerCase();
        StringBuilder waveCase = new StringBuilder();
        for (int i = 0; i < text.length(); i += 1) {
            if (i % 2 == 0) waveCase.append(text.charAt(i));
            else waveCase.append((char) (text.charAt(i) - 32));
        }
        System.out.println("An example of wave case:            " + waveCase);

        try {
            writeToDir(waveCase.toString().toCharArray());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private static void writeToDir(char[] arr) throws IOException {
        File dir = new File("resources" + File.separator + "lesson4" + File.separator + "arr");
        if (!dir.exists()) dir.mkdir();
        for (int i = 0; i < arr.length; i++) {
            try (FileWriter fw = new FileWriter("resources" + File.separator + "lesson4" +
                    File.separator + "arr" + File.separator + "element" + i + ".txt")) {
                fw.write(String.valueOf(arr[i]));
            }

        }
    }

}