package com.ua.robot.lesson26;

public class Squared {

    public static int toThePowerOfTwo(int number){
        try{
            if(number>0){
                number=number*number;
            }else{
                throw new NegativeNumberException("Number is negative");
            }

        }catch (NegativeNumberException e){
            e.printStackTrace();
        }


        return number;
    }
}
