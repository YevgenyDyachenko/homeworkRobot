package com.ua.robot.lesson12;

public class Parent {
    private static int instanceCount = 0;
    private final int serialNumber;

    static{
        System.out.println("Static initialization block for Parent");
        System.out.println("Static initialization block is executed only once");
        System.out.println("1");
    }
    {
        instanceCount++;
        serialNumber = instanceCount;
        System.out.println("Instance initialization block for Parent");
        System.out.println("3");
    }

    public Parent() {
        System.out.println("Constructor in Parent");
        System.out.printf("Object with serial number - %d\n", serialNumber);
        System.out.println("4");
    }
}
