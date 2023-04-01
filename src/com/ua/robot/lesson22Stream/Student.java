package com.ua.robot.lesson22Stream;

public class Student implements Comparable<Student>{
    private String lastName;
    private double averageScore;

    public Student(String lastName, double averageScore) {
        this.lastName = lastName;
        this.averageScore = averageScore;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    private String formatLastName(String someLastName){
        return someLastName.substring(0, 1).toUpperCase()+ someLastName.substring(1).toLowerCase();
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + formatLastName(lastName) + '\'' +
                ", " +
                "score=" + averageScore +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return (int)(this.averageScore-o.getAverageScore());
    }


}
