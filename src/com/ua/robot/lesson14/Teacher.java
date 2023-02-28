package com.ua.robot.lesson14;

import java.util.Random;

public class Teacher extends Member{
    private final String ROLE;
    private double salary;

    public Teacher(String name, int age, String university, double salary) {
        super(name, age, university);
        this.salary = salary;
        ROLE = "Teacher";
    }

    public String getROLE() {
        return ROLE;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "ROLE='" + ROLE + '\'' +
                ", salary=" + salary +
                ", university='" + university + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private String generateQuality(){
        Random random = new Random();
        int n = random.nextInt(3);

        return switch (n) {
            case 0 -> "tensely";
            case 1 ->  "efficient";
            case 2 -> "productive";
            default -> "magnificently";};
    }



    @Override
    public void doWork(String name) {
        System.out.printf("Teacher %s works %s\n", name, generateQuality() );
    }

    @Override
    public void belongsTo() {
        System.out.printf("Teacher %s works at %s\n", name, university);
    }
}
