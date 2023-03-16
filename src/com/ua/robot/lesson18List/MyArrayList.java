package com.ua.robot.lesson18List;

public class MyArrayList<T> {
    private T[] arr;
    private int size;
    private int capacity;

    public MyArrayList() {
        arr = (T[]) new Object[10];
        size = 0;
        capacity = 10;
    }



    public void add(T element) {
        if (size == capacity) {
            T[] temp = (T[]) new Object[2 * capacity];
            for (int i = 0; i < capacity; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
            capacity *= 2;
        }
        arr[size] = element;
        size++;

    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return arr[index];
    }

    public void set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        arr[index] = element;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    public void print(){
        System.out.print("[ ");

        for (int i = 0; i< size; i++){
            if(arr[i]==null){
                System.out.print("null ");
                continue;
            }
            System.out.print(arr[i].toString());
            System.out.print(" ");
        }

        System.out.println("]");

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
