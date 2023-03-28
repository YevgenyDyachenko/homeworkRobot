package com.ua.robot.lesson22Stream;

import java.util.Comparator;

public class StudentComparators {
    public static Comparator<Student> compareByLastName = Comparator.comparing(Student::getLastName);
    public static Comparator<Student> compareByAverageScore = Comparator.comparingDouble(Student::getAverageScore);
}
