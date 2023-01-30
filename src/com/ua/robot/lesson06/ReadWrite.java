package com.ua.robot.lesson06;

import java.io.*;
import java.util.Arrays;

public class ReadWrite {

    //this method reads only last line
    public static int readNumberFromLastLine(int k) throws IOException {
        String[] values = new String[10];
        try (BufferedReader br = new BufferedReader(new FileReader("resources" + File.separator + "lesson06" + File.separator + "text.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                values = line.split(" ");

            }
        }

        return Integer.valueOf(values[k]);

    }


    public static int readNumberFromLine(int line, int index) {
        BufferedReader br = null;
        String strLine = "";
        String[] values = new String[10];
        try {
            LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream("resources" + File.separator + "lesson06" + File.separator + "text.txt"), "UTF-8"));
            while (((strLine = reader.readLine()) != null) && reader.getLineNumber() <= line) {
                values = strLine.split(" ");
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }

        return Integer.valueOf(values[index]);
    }


        public static void write(String values){
            try (
                 BufferedWriter bw = new BufferedWriter(new FileWriter("resources" + File.separator + "lesson06" + File.separator + "result.txt"))) {
                String line;

                        bw.write(values + '\n');

                } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        //append to existing file, argument true
    public static void writeAppend(String values){
        try (
                BufferedWriter bw = new BufferedWriter(new FileWriter("resources" + File.separator + "lesson06" + File.separator + "result.txt", true))) {
            String line;

            bw.append(values + '\n');
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
