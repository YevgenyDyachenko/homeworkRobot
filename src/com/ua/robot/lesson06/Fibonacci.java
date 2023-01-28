package com.ua.robot.lesson06;

public class Fibonacci {
    public static void fibo(int n){
        int first=0, second =1;
        while (first<n){
            System.out.print(first + " ");
            System.out.print(second + " ");
            first = first + second;
            second =first + second;

        }
        System.out.println("End of the while loop");
    }
        public static void fiboFor(int k){
            int first=0, second =1;

            for ( ; ; ){


                System.out.print(first + " ");
                System.out.print(second + " ");
                first = first + second;
                second =first + second;
                if(first>k) break;

            }
            System.out.println("End of the for loop");

    }

}
