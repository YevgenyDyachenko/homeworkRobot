package com.ua.robot.lesson28NIO;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        final String PATHTOFOLDER = "resources" + File.separator + "lesson28";
        //type "stop" in console to finish entering your text
        String text = ReadConsole.rcToString();

       NIOReadWrite.writeToFileNio(PATHTOFOLDER, "myTest.txt",text);

       System.out.println(NIOReadWrite.readFromFileNIO(PATHTOFOLDER, "myTest.txt"));



    }
}
