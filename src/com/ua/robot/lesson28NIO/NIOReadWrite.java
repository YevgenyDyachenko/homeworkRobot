package com.ua.robot.lesson28NIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class NIOReadWrite {

    public static void writeToFileNio(String pathToFileFolder, String fileName, String text){
        Path folder= Path.of(pathToFileFolder);
        var isExist = Files.exists(folder);
        if(isExist!=true){
            try {
                Files.createDirectory(folder);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        Path fileToWrite= Path.of(pathToFileFolder + File.separator + fileName );
        var isFileExist = Files.exists(fileToWrite);
        if(isExist!=true){
            try {
                Files.createFile(fileToWrite);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            Files.write(fileToWrite, text.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public static String readFromFileNIO(String pathToFileFolder, String fileName){
        Path folder= Path.of(pathToFileFolder);
        List<String> readFile;

        try {
            readFile = Files.readAllLines(folder.resolve(fileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String result = readFile.stream()
                .map(n ->String.valueOf(n))
                .collect(Collectors.joining("-", "{", "}"));

        return result;
    }


    }


