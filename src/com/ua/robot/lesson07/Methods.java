package com.ua.robot.lesson07;

import com.ua.robot.lesson07.asterisk.Draw;
import com.ua.robot.lesson07.draw.Art;

import java.io.IOException;

public class Methods {

    public static void main(String[] args) throws IOException {

        int select = 11;
        int power = 4;
       // String symbol = "\u002A";
        String symbol = "\u0024";


        var foo = new Methods();
        String messageCube = String.format("The cube of the number %d is %d", select, foo.cubeOfNumber(select));
        String messagePower = String.format("The number %d to the power of %d is %d", select, power, foo.powerOfNumber(select, power));
        System.out.println(messageCube);
        System.out.println(messagePower);

        foo.printAsterisk(select);
        foo.printSymbol(select, symbol);
        foo.printAsteriskWithMethod(select);

        new Draw().drawLargeAsterisk(select, symbol);

        int width = 100;
        int height = 30;
        String symbol2 = "$";

        new Art().artJava(width, height, symbol2);

    }

    int cubeOfNumber(int number){
        return number*number*number;
    }

    int powerOfNumber(int base, int powerRaised) {
        if (powerRaised != 0) {

            return (base * powerOfNumber(base, powerRaised - 1));
        } else {
            return 1;
        }
    }

    void printAsterisk(int capacity){
        char charSymbol = (char)42;
        for (int i=0; i<capacity; i++) {System.out.print(charSymbol + " ");}
        System.out.println();
    }

    void printSymbol(int capacity, String s){
        for (int i=0; i<capacity; i++){
            System.out.print(s + " ");}
        System.out.println();
    }

    void printAsteriskWithMethod(int capacity){
       printSymbol(capacity, "*");
    }

}
