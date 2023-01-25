package com.ua.robot.lesson05;


import com.ua.robot.lesson05.compare.CompareNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Enter the first number:");

        var firstNumber = Integer.parseInt(reader.readLine());
        System.out.println("Enter the second number:");
        var secondNumber = Integer.parseInt(reader.readLine());

        new CompareNumbers().compareTwoIntNumber(firstNumber, secondNumber);

        System.out.println();

        System.out.println(CompareNumbers.compareFindSmaller(firstNumber, secondNumber));

        System.out.println();

        System.out.println("Want to check if the number is odd or even? Enter your  number:");

        String result = (Integer.valueOf(reader.readLine()) % 2 == 0)
                ? "Your number is an even number"
                : "Your number is an odd number";
        System.out.println(result);

//        if (Integer.parseInt(reader.readLine())%2==0) System.out.println("It's an even number");
//        else System.out.println("It's an odd number");




    }


}

