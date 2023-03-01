package com.ua.robot.lesson15;

public class Main {
    public static void main(String[] args) {
        Flyable greatPilot  = new Pilot("Baron Manfred Von Richthofen");
        DrivingProcess bestDriver = new Driver("Michael Schumacher");
        Pilot comercialAviationPilot = new Pilot("Christiaan van Heijst", "Boeing 747");

        greatPilot.takeOff();
        greatPilot.fly(150);
        greatPilot.land();

        System.out.println();

        bestDriver.start();
        bestDriver.accelerate(247);
        bestDriver.stop();

        System.out.println();

        comercialAviationPilot.printPlaneInfo();
        comercialAviationPilot.start();
        comercialAviationPilot.accelerate(296);
        comercialAviationPilot.takeOff();
        comercialAviationPilot.fly(988);
        comercialAviationPilot.land();
        comercialAviationPilot.stop();
    }
}
