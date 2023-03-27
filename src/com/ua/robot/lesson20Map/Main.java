package com.ua.robot.lesson20Map;


import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Vocabulary d = new Vocabulary(10, 30);
        Map<String, Word> vocabulary = d.getDictionary();

        Scanner scanner = new Scanner(System.in);
        String wantAnotherWord;

        System.out.println("In my dictionary I have these words:");
        System.out.println(vocabulary.keySet());

        do {

            System.out.println("Enter any of these words to know the German, English and Japanese translation:");
            String word = scanner.nextLine();

            while (!vocabulary.containsKey(word.toLowerCase())){
                System.out.println("There is no such word in my dictionary");
                System.out.println("Enter a word in Ukrainian:");
                word = scanner.nextLine();
            }

            System.out.printf("English translation of this word is: %s\n", vocabulary.get(word).getEn());
            System.out.printf("German translation of this word is: %s\n", vocabulary.get(word).getDe());
            System.out.printf("English translation of this word is: %s\n", vocabulary.get(word).getJap());

            System.out.println("If you want to know the translation of another word, enter: y");
            wantAnotherWord = scanner.nextLine();

        } while(wantAnotherWord.equalsIgnoreCase("y"));

        System.out.println("Good bye!");





    }

}
