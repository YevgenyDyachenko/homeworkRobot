package com.ua.robot.lesson06;

public class ShowEvenNumbers {
    static StringBuilder result = new StringBuilder();

    public static void printEvenFor(int n, int k){
        for (int i=n; i<=k; i++){
            if(i%2!=0) continue;
            result.append(i + " ");
            //System.out.print(i + " ");
        }
        result.append("End of the for-loop");
        ReadWrite.writeAppend(result.toString());
        System.out.println(result);
    }

    public static void printEvenWhile(int n, int k) {

        result.delete(0, result.length());
        do {
            if(n%2==0)  result.append(n + " ");


            n++;
        }while (n<=k);
        result.append("End of the do-while loop");
        ReadWrite.writeAppend(result.toString());
        System.out.println(result);


    }

}
