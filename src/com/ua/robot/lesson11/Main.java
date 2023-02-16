package com.ua.robot.lesson11;


public class Main
{

    public static void main(String[] args)
    {

     Vehicle machine = new Vehicle();
     Car auto= new Car();
     Truck lorry = new Truck();

       machine.printType();
       auto.printType();
       lorry.printType();


        System.out.println(machine.returnType());
        System.out.println(auto.returnType());
        System.out.println(lorry.returnType());







    }
}
