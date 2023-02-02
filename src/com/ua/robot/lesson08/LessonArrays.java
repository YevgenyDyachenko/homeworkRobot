package com.ua.robot.lesson08;

import java.util.Random;

public class LessonArrays
{
    public static void main(String[] args)
    {

       int arrayCapacity = 10;

       int [] myArray =  arrayOfRandomNumbers(arrayCapacity);
        printArray(myArray);
        System.out.printf("The smallest number in myArray is %d\n", minNumberInArray(myArray));
        System.out.printf("The biggest number in myArray is %d\n", maxNumberInArray(myArray));
        System.out.format("The average is: %.3f\n", averageOfArray(myArray));
        System.out.format("The sum of the elements is: %d\n", sumOfElements(myArray));


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
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();

    }

    //the smallest element in an array
    static int minNumberInArray(int[] arr)
    {
        if (arr.length == 0)
        {
            System.out.println("An array is empty");
            return -1;

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
            return -1;

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

    static double averageOfArray(int[] arr)
    {

        double total =  sumOfElements(arr);

        return total/arr.length;

    }

    static int sumOfElements(int[] arr)
    {

        int sum=0;
        for (int j : arr) {
            sum += j;

        }
        return sum;

    }



}