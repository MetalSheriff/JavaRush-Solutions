package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/
import java.io.*;
public class Solution {
    public static void main(String[] args) throws Exception {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String s = reader.readLine();
        int i = Integer.parseInt(s);
        
        if (i<0)
        System.out.println(i + 1);
        else if (i>0)
        System.out.println(i * 2);
        else if (i==0)
        System.out.println(0);

    }

}