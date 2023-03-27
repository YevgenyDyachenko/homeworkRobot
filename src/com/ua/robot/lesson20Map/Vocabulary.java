package com.ua.robot.lesson20Map;

import java.io.*;
import java.util.*;

public class Vocabulary {
    private Map<String, Word> dictionary;

    Word someWord;

    public Vocabulary(int wordsInMap, int wordsInTXTFile) {

        createDictionary(wordsInTXTFile, wordsInMap);
    }




    public Map<String, Word> getDictionary() {
        return dictionary;
    }

    public String[] readNumberFromLine(int line) {


        String strLine ;
        String[] values = new String[4];

        try {
            LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream("resources" + File.separator + "lesson20" + File.separator + "text.txt"), "UTF-8"));
            while (((strLine = reader.readLine()) != null) && reader.getLineNumber() <= line) {
                values = strLine.split(" ");
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }


        return values;
    }


    private void createDictionary(int numberOfWords, int capacity){

        dictionary = new TreeMap<>();



        Set<Integer> fullSet = new HashSet<>();

        Random random = new Random();
        int randomNumber;

        String[] wordsFromList;



        while(fullSet.size()<capacity){
            randomNumber = random.nextInt(numberOfWords) + 1;
            if(fullSet.contains(randomNumber)){
                continue;
            }
            fullSet.add(randomNumber);

            wordsFromList = readNumberFromLine(randomNumber);
            someWord = new Word(wordsFromList[0], wordsFromList[1] ,wordsFromList[2] ,wordsFromList[3]);
            dictionary.put(someWord.getUa(), someWord);

        }



    }


}
