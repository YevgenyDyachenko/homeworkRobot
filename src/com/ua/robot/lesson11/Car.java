package com.ua.robot.lesson11;

public class Car extends Vehicle
{
    String type = "Car";

    @Override
    protected void printType() {
        System.out.printf("Type - %s\n", type);
    }
}
