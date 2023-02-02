package com.ua.robot.lesson08;

import java.util.Random;

public class LessonArrays
{
    public static void main(String[] args)
    {

       int arrayCapacity = 0;

       int [] myArray =  arrayOfRandomNumbers(arrayCapacity);
        printArray(myArray);
        System.out.printf("The smallest number in myArray is %d\n", minNumberInArray(myArray));
        System.out.printf("The biggest number in myArray is %d\n", maxNumberInArray(myArray));


    }


    static int[] arrayOfRandomNumbers(int capacity)
    {
        Random randomNumber = new Random();

        int[] arrayOfNumbers = new int[capacity];

        for (int i = 0; i < arrayOfNumbers.length; i++)
        {
            arrayOfNumbers[i] = randomNumber.nextInt(100);
        }
        return arrayOfNumbers;
    }


    static void printArray(int [] arr)
    {
        for (int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    //the smallest element in an array
    static int minNumberInArray(int[] arr)
    {
        if (arr.length == 0)
        {
            System.out.println("An array is empty");

        }
        int smallest=arr[0];
        for (int i = 1; i<arr.length; i++)
        {
           if(arr[i]<smallest)
           {
               smallest=arr[i];
           }

        }
        return smallest;

    }

    //the biggest element in an array

    static int maxNumberInArray(int[] arr)
    {
        if (arr.length == 0)
        {
            System.out.println("An array is empty");

        }
        int biggest=arr[0];
        for (int i = 1; i<arr.length; i++)
        {
            if(arr[i]>biggest)
            {
                biggest=arr[i];
            }

        }
        return biggest;

    }

    static int averageOfArray(int[] arr)
    {
        if (arr.length == 0)
        {
            System.out.println("An array is empty");

        }
        int summ = 0;
        for (int i = 1; i<arr.length; i++)
        {
            summ+=arr[i];

        }
        return summ/arr.length;

    }

}