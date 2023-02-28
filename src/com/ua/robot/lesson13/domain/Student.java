package com.ua.robot.lesson13.domain;

public class Student extends Member {

    private double scores;
    private final String role;




    public Student(int id, String name, int age, String university, double scores) {
        super(id, name, age, university);
        this.scores = scores;
        role = "Student";
    }



    public double getScores() {
        return scores;
    }

    public void setScores(double scores) {
        this.scores = scores;
    }

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Student{" +
                "scores=" + scores +
                ", role='" + role + '\'' +
                ", university='" + university + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
