package com.ua.robot.lesson06;

public class Fibonacci {

    static StringBuffer result = new StringBuffer();
    public static void fibo(int n){
        int first=0, second =1;
        while (first<n){
            result.append(first + " ");
            result.append(second + " ");

            first = first + second;
            second =first + second;

        }
        result.append("End of the while loop");
        ReadWrite.writeAppend(result.toString());
        System.out.println(result);
    }
        public static void fiboFor(int k){

            result.delete(0, result.length());

            int first=0, second =1;

            for ( ; ; ){


                result.append(first + " ");
                result.append(second + " ");

                System.out.print(first + " ");
                System.out.print(second + " ");
                first = first + second;
                second =first + second;
                if(first>k) break;

            }

            ReadWrite.writeAppend(result + "End of the for-loop");
            System.out.println("End of the for-loop");

    }

}
