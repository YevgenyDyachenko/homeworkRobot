package com.ua.robot.lesson22Stream;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Student> originalList = Arrays.asList(
        new Student("Thompson", 4.5), new Student("ePSOM", 3.5));
        originalList =  new ArrayList<>(originalList);
        originalList.add(new Student("Babel", 2.0));
        originalList.add(new Student("Jonson", 5.0));
        originalList.add(new Student("Anderson", 4.0));
        System.out.println("Original list of students:");
        System.out.println(originalList);

      List <Student> compareLastName= originalList.stream().
                sorted((o1, o2) -> o1.getLastName().compareToIgnoreCase(o2.getLastName())).collect(Collectors.toList());
        System.out.println("New list of students. Sort by LastName:");
        System.out.println(compareLastName);

      List<Student> compareScore= originalList.stream().
               sorted((o1, o2) -> (o1.getAverageScore()<o2.getAverageScore()?-1: o1.getAverageScore()==o2.getAverageScore()?0:1))
              .collect(Collectors.toList());
      System.out.println("New list of students. Sort by AverageScore:");
      System.out.println(compareScore);

        List<Student> compareScoreReversed = originalList.stream()
                .sorted(Comparator.comparingDouble(Student::getAverageScore).reversed()).toList();
        System.out.println("New list of students. Sort by AverageScore in reversed order:");
        System.out.println(compareScoreReversed);

        List<Student> compareLNReversed = originalList.stream()
                .sorted(Comparator.comparing(Student::getLastName).reversed()).toList();
        System.out.println("New list of students. Sort by LastName in reversed order:");
        System.out.println(compareLNReversed);


        System.out.println("Again Original list of students:");
        System.out.println(originalList);

        originalList.sort(StudentComparators.compareByLastName);
        System.out.println("Changed Original list of students sorted by LastName:");
        System.out.println(originalList);

        Collections.sort(originalList, StudentComparators.compareByAverageScore);
        System.out.println("Changed Original list of students sorted by AverageScore:");
        System.out.println(originalList);



    }
}
