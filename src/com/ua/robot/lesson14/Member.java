package com.ua.robot.lesson14;

public abstract class Member extends Person{
    protected String university;


    public Member(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    public abstract void belongsTo();




}
