package com.ua.robot.lesson11;

public class Truck extends Vehicle
{
    String type = "Truck";

    @Override
    protected void printType() {
        System.out.printf("Type - %s\n", type);
    }

}
