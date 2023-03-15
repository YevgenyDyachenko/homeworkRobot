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

        capacity = 2000000;
        bound = 5;

        for (int i=0; i<capacity; i++){
            largeList.add(random.nextInt(bound));
        }
        System.out.println(largeList);


        List<Student> students = new ArrayList<>();
        students.add(new Student("Bob", 19));
        students.add(new Student("Mia", 18));
        students.add(new Student("Tom", 20));
        students.add(new Student("Alisa", 21));
        System.out.println(students);

        for(Student e: students){
            System.out.println(e.getName() + " " + e.getAge() );
        }

        MyArrayList <String> myList = new MyArrayList<>();
        myList.add("January");
        myList.add("February");
        myList.add("March");
        myList.add(null);
        myList.add("May");


        myList.print();
        System.out.println(myList.isEmpty());
        myList.set(3, "April");

        myList.print();

        System.out.println("_______");

        MyLinkedList <Student> schoolList = new MyLinkedList<>();
        schoolList.add(new Student("Den", 10));
        schoolList.add(new Student("Sia", 11));
        schoolList.add(new Student("Kate", 9));
        schoolList.add(new Student("Mark", 12));

        for(int i = 0; i< schoolList.size(); i++){
            System.out.println(schoolList.get(i));
        }



    }



}
