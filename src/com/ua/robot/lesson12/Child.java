package com.ua.robot.lesson12;

public class Child extends Parent {

    private static int instanceCount = 0;
    private final int serialNumber;

    static{
        System.out.println("Static initialization block for Child");
        System.out.println("Static initialization block is executed only once");
        System.out.println("2");
    }
    {
        instanceCount++;
        serialNumber = instanceCount;
        System.out.println("Instance initialization block for Child");
        System.out.println("5");
    }

    public Child() {
        System.out.println("Constructor in Child");
        System.out.printf("Object with serial number - %d\n", serialNumber);
        System.out.println("6");
    }
}
