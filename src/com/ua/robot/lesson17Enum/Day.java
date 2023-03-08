package com.ua.robot.lesson17Enum;

import java.util.Random;

public class Day {


    public static void main(String[] args) {
        Day myday = new Day();

        DaysOfTheWeek [] days = DaysOfTheWeek.values();
        int randomNumberOfDay = myday.generateRandomDay();
        System.out.print("First method: \nRandom number: " + randomNumberOfDay + " matches ");
        System.out.println(myday.getDayWithForLoop(days, randomNumberOfDay));

        System.out.print("Second method: \nRandom number: " + randomNumberOfDay + " matches ");
        System.out.println(myday.getTheDayByNumber(randomNumberOfDay));

    }

     DaysOfTheWeek getDayWithForLoop(DaysOfTheWeek[] days, int num) {
        DaysOfTheWeek result=null;
        for (DaysOfTheWeek day : days) {
           if (day.getIndexNumber()== num){
               result = day;
           }
        }
        return result;
    }

    DaysOfTheWeek getTheDayByNumber(int val){

       if(val<1||val>7) {
           System.out.println("Input data is incorrect");
       }
        return switch (val){

            case 1 -> DaysOfTheWeek.MONDAY;
            case 2 -> DaysOfTheWeek.TUESDAY;
            case 3 -> DaysOfTheWeek.WEDNESDAY;
            case 4 -> DaysOfTheWeek.THURSDAY;
            case 5 -> DaysOfTheWeek.FRIDAY;
            case 6 -> DaysOfTheWeek.SATURDAY;
            default -> DaysOfTheWeek.SUNDAY;

        };

    }


    private int generateRandomDay() {
        Random random = new Random();
        int min = 1;
        int max = 7;

        return random.nextInt(max-min+1) +min;
    }
}

