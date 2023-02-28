package com.ua.robot.lesson13.domain;

public class Teacher extends Member {
    private double salary;
    private final String role;




    public Teacher(int id, String name, int age, String university, double salary) {
        super(id, name, age, university);
        this.salary = salary;
        role = "Teacher";
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "role='" + role + '\'' +
                ", university='" + university + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
