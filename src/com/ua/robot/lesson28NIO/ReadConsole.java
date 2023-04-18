package com.ua.robot.lesson28NIO;

import java.util.Scanner;

public class ReadConsole {
    public static String rcToString(){
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String line;
        line = scanner.nextLine();
        while(!line.equalsIgnoreCase("stop")){
            sb.append(line).append("\n");
           line = scanner.nextLine();

        }

        return sb.toString();
    }


}
