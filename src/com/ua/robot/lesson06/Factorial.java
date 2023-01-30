package com.ua.robot.lesson06;

public class Factorial {

    public static void factorial(int n){
        int fact= 1;
        for(int i = n; i>=1; i--) fact*=i;

        String result = String.format("Factorial of the number %d is %d. End of the for-loop", n , fact);
        ReadWrite.writeAppend(result);
        System.out.println(result);
    }

}
