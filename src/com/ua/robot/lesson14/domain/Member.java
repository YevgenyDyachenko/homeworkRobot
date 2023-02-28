package com.ua.robot.lesson14.domain;

public abstract class Member extends Person {
    protected String university;


    public Member(int id, String name, int age, String university) {
        super(id, name, age);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
