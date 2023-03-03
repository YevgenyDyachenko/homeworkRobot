package com.ua.robot.lesson15;

public class Pilot extends Person implements Flyable {

    private String planeType;


    public Pilot(String name) {
        super(name);
    }

    public Pilot(String name, String planeType) {
        super(name);
        this.planeType = planeType;
    }



    @Override
    public void start() {
        System.out.println(name + "is starting an airplane");
    }

    @Override
    public void accelerate(int speed) {


        System.out.println(name + "is accelerating the airplane to " + speed + " km/h");

    }

    @Override
    public void stop() {
        System.out.println(name + " is stopping");

    }


    @Override
    public void takeOff() {
        System.out.println(name + " is taking off");

    }

    @Override
    public void fly(int speed) {
        System.out.println(name + " is flying at speed " + speed + " km/h");

    }

    @Override
    public void land() {
        System.out.println(name + " is landing");

    }

    public void printPlaneInfo(){
        System.out.println(name + " flies on " + planeType);
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }
}
