package com.ua.robot.lesson11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vehicle
{

    String type = "Vehicle";

    protected void printType()
    {
        System.out.printf("Type - %s\n", type);

    }


    protected String returnType()
    {

        String typeName = String.valueOf(this.getClass());

        if (typeName.contains("."))
        {
            Pattern pattern = Pattern.compile("\\.");
            Matcher matcher = pattern.matcher(typeName);
            int end = 0;
            while (matcher.find())
            {
                end = matcher.end();
            }

           typeName=typeName.substring(end);
        }
        else
        {
            typeName.split(" ");
            typeName = typeName.split(" ")[1];

        }


       return "This is a " + typeName;

    }


}
