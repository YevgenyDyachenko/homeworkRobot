package com.ua.robot.lesson27IO;

import java.io.*;

public class ReadWrite {


    public static void writeToFile(String pathToFile, String text) throws FileNotFoundException {
        FileOutputStream file = new FileOutputStream(pathToFile);
        OutputStreamWriter output = new OutputStreamWriter(file);
        try {
            output.write(text);
            output.close();
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void readFromFile(String pathToFile){
        FileInputStream file;
        char[] array;
        try {
            file = new FileInputStream(pathToFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        InputStreamReader input = new InputStreamReader(file);

        try {
            array = new char[100];
             input.read(array);
             input.close();
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Data in the stream:");
        for (char i:array
             ) {
            System.out.print(i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println();

    }


    public static void readFromFileSecondMethod(String pathToFile){

        try {
            FileInputStream file = new FileInputStream(pathToFile);

            InputStreamReader input = new InputStreamReader(file);
            int t;
            String read_reslt = "";
            while ((t = input.read()) != -1) {
                read_reslt = read_reslt + (char) t;
            }
            input.close();
            file.close();


            System.out.println(read_reslt);
        }catch (FileNotFoundException fnfe)
        {
            System.out.println("NO Such File Exists");
        }
        catch (IOException except)
        {
            System.out.println("IOException occurred");
        }


    }




}
