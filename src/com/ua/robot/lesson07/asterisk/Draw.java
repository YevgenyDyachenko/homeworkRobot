package com.ua.robot.lesson07.asterisk;

public class Draw {


    public void drawLargeAsterisk(int n, String symbol){
        //n should be odd
        if (n%2==0) n--;
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                if(i==0 || i==j || i == n-1 || i ==(n-1)/2 || i == n-j-1 || j==0 || j==n-1 || j == (n-1)/2){
                    System.out.print(symbol + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}
