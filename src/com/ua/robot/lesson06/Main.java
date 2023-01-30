package com.ua.robot.lesson06;

import java.io.IOException;

public class Main {



    public static void main(String[] args) throws IOException {

        int min = ReadWrite.readNumberFromLine(1, 1);
        int max = ReadWrite.readNumberFromLine(1, 2);
        PrintNumbersInRange.printNumWhile(min, max);
        PrintNumbersInRange.printNumFor(min, max);


        int start = ReadWrite.readNumberFromLine(2, 1);
        int finish = ReadWrite.readNumberFromLine(2, 2);
        ShowEvenNumbers.printEvenFor(start, finish);
        ShowEvenNumbers.printEvenWhile(start, finish);

        int num = ReadWrite.readNumberFromLine(3, 1);
        Factorial.factorial(num);

        int border = ReadWrite.readNumberFromLastLine(1);
        Fibonacci.fibo(border);
        Fibonacci.fiboFor(border);














    }


}
