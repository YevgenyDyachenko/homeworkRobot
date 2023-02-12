package com.ua.robot.lesson10;

public class Main {
    public static void main(String[] args) {
        Student josh = new Student("Josh Alman", 1, 4.5 );

        System.out.println(josh);

        Teacher danielTeacher = new Teacher("Daniel Bauer", "CS", 20);
        danielTeacher.rateStudent(josh, 5.0);

        System.out.println(josh);

        System.out.println(danielTeacher);

        Student alexandr = new Student("Alexandr Adoni", 8, 0);
        alexandr.enrollOnCourse(danielTeacher);

        System.out.println(danielTeacher);

        WorkWithArray myArray = new WorkWithArray(25, 30, 100);

        myArray.setMinRange(20);

        int [] result = myArray.createRandomArray();

        myArray.printArray(result);

        myArray.sortAscendingOrder(result);

        myArray.printArray(result);

        myArray.sortDescendingOrder(result);

        myArray.printArray(result);


    }
}
