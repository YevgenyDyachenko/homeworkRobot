package com.ua.robot.lesson14;

import java.util.Random;

public class Student extends Member{
    private final String ROLE;
    private double scores;

    public Student(String name, int age, String university, double scores) {
        super(name, age, university);
        this.scores = scores;
        ROLE = "Student";
    }

    public String getROLE() {
        return ROLE;
    }

    public double getScores() {
        return scores;
    }

    public void setScores(double scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ROLE='" + ROLE + '\'' +
                ", scores=" + scores +
                ", university='" + university + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

   private String generateQuality(){
        Random random = new Random();
        int n = random.nextInt(3);

        return switch (n) {
            case 0 -> "great";
            case 1 ->  "good";
            case 2 -> "ok";
            default ->  "relaxed";
        };
   }

    @Override
    public void doWork(String name) {
        System.out.printf("Student %s studies %s\n", name, generateQuality() );
    }


    @Override
    public void belongsTo() {
        System.out.printf("Student %s studies at %s\n", name, university );
    }
}
