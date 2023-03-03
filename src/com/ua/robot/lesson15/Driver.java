package com.ua.robot.lesson15;

public class Driver extends Person{

    public Driver(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println(name + " is starting the vehicle");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println(name + " is accelerating to " + speed + " km/h");
    }

    @Override
    public void stop() {

        System.out.println(name + " is stopping");

    }
}
