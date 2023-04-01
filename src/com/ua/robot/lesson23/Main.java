package com.ua.robot.lesson23;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        List<String> someRandomNames = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            StringBuilder name = new StringBuilder();
            int nameLength = random.nextInt(7) + 4;
            name.append((char) (random.nextInt(26) + 'A'));
            for (int j = 1; j < nameLength; j++) {
                name.append((char) (random.nextInt(26) + 'a'));
            }
            someRandomNames.add(name.toString());
        }
        System.out.println(someRandomNames);

        List<String> listOfDuplicateNames = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            listOfDuplicateNames.add(someRandomNames.get(random.nextInt(someRandomNames.size())));
        }
        System.out.println(listOfDuplicateNames);


        Map<String, Long> lastNameCount = listOfDuplicateNames.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(lastNameCount);


        List<Integer> listRandomNumbers = random.ints(random.nextInt(10, 30), 0, 1000).boxed().collect(Collectors.toList());
        System.out.println(listRandomNumbers);
        int sum = listRandomNumbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);


    }

}
