package com.ua.robot.lesson07;



public class Methods {

    public static void main(String[] args) {

        int select = 11;
        int power = 4;
        String symbol = "*";

        var foo = new Methods();
        String messageCube = String.format("The cube of the number %d is %d", select, foo.cubeOfNumber(select));
        String messagePower = String.format("The number %d to the power of %d is %d", select, power, foo.powerOfNumber(select, power));
        System.out.println(messageCube);
        System.out.println(messagePower);

        foo.printAsterisk(select);
        foo.printSymbol(select, symbol);
        foo.printAsteriskWithMethod(select);

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
        for (int i=0; i<capacity; i++) {
            System.out.print(charSymbol + " ");
        }
        System.out.println();
    }


    void printSymbol(int capacity, String s){
        for (int i=0; i<capacity; i++) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    void printAsteriskWithMethod(int capacity){
       printSymbol(capacity, "*");
    }

}
