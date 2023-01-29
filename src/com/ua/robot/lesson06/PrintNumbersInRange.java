package com.ua.robot.lesson06;

public class PrintNumbersInRange {

   //start a new file and write to it
    public static void printNumWhile(int n, int k) {
        //String for result
        String result = "";

        do {
           System.out.print(n + " ");
          //add to string new number
           result +=n +" ";
           n++;
       }while (n<=k);
       //write to the file
        ReadWrite.write(result + " End of the do-while loop");
        System.out.println("End of the do-while loop");
    }

   //append to existing file
    public static void printNumFor(int n, int k){
        String result = "";
        for (int i=n; i<=k; i++){
            result +=n +" ";
            n++;
            System.out.print(i + " ");
        }
        ReadWrite.writeAppend(result + " End of the for-loop");
        System.out.println("End of the for-loop");

    }


}
