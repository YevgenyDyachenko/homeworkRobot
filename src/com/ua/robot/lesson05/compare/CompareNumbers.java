package com.ua.robot.lesson05.compare;

public class CompareNumbers {


    public static void compareTwoIntNumber(Integer a, Integer b){
        int c = Integer.compare(a, b);

        switch (c){
            case 1 -> System.out.println("The first value is greater than the second");
            case -1 -> System.out.println("The second value is greater than the first");
            case 0 -> System.out.println("They are equal");
        }
    }
    public static String compareNumbers(Integer a, Integer b){
        int c = Integer.compare(a, b);

        switch (c){
            case 1: return "first";
            case -1: return "second";
            default: return "equal";
        }
    }

    public static String compareFindSmaller(Integer a, Integer b){
        int c = Integer.compare(a, b);
        if (a==b) return "They are equal";
        if(a<b)  return "The first value is smaller than the second";
        else   return ("The second value is smaller than the first");
        }

}
