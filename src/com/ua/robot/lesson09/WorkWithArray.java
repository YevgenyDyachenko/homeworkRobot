package com.ua.robot.lesson09;

import java.util.Random;

public class WorkWithArray {

    private int size;


    private int minRange;
    private int maxRange;



    public WorkWithArray(int size, int minRange, int maxRange) {
        this.size = size;
        this.minRange = minRange;
        this.maxRange = maxRange;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {

        this.size = size;
    }



    public int getMinRange() {
        return minRange;
    }

    public void setMinRange(int minRange) {
        this.minRange = minRange;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(int maxRange) {
        this.maxRange = maxRange;
    }

    public int[] createRandomArray() {
        Random rd = new Random();
        int[] array = new int[size];
       int min= getMinRange();
       int max =getMaxRange();

        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(max-min+1) + min;

        }
        return array;
    }

    public int[] sortAscendingOrder(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }

        }
        return arr;
    }




    public int[] sortDescendingOrder(int [] array){

        int temp;

        for (int i = 0; i < array.length; i++)
        {
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[i] < array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }

    public void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "CreateArray{" +
                "size=" + size +
                '}';
    }
}
