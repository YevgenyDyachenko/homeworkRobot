package com.ua.robot.lesson19Set;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int numberOfRepetitionsInLoop = 1000;
        int randomRange = 50;

        Set<Integer> set = new HashSet<>();
        fillWithRandomNumbers(set, randomRange, numberOfRepetitionsInLoop);
        System.out.println(set);

        set = new LinkedHashSet<>();
        fillWithRandomNumbers(set, randomRange, numberOfRepetitionsInLoop);
        System.out.println(set);


        set = new TreeSet<>();
        fillWithRandomNumbers(set, randomRange, numberOfRepetitionsInLoop);
        System.out.println(set);


    }

    public static void fillWithRandomNumbers(Set<Integer> fullSet, int bound, int repetitionsInLoop){
        Random random = new Random();
        int randomNumber;

        for(int i=0; i < repetitionsInLoop; i++){
            randomNumber = random.nextInt(bound) + 1;
            fullSet.add(randomNumber);
        }
    }


}
