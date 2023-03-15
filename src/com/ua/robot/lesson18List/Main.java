package com.ua.robot.lesson18List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> smallList = new ArrayList<>();

        int capacity =10;
        int bound = 50;

        for (int i=0; i<capacity; i++){
            smallList.add(random.nextInt(bound));
        }
        System.out.println(smallList);


        List<Integer> largeList = new LinkedList<>();

        capacity = 100000;
        bound = 5;

        for (int i=0; i<capacity; i++){
            largeList.add(random.nextInt(bound));
        }
        System.out.println(largeList);





    }


}
