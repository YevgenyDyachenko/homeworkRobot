package com.ua.robot.lesson10;

public class Student
{

    private String name;
    private int id;

   //grade point average (gpa)
    private double score;


    public Student() {
    }

    public Student(String name, int id, double score) {
        this.name = name;
        this.id = id;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Teacher enrollOnCourse(Teacher teacher){
        teacher.setTotalStudents(teacher.getTotalStudents()+1);
        return teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", score=" + score +
                '}';
    }
}
