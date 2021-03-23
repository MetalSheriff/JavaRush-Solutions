package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/
import java.io.*;
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String s = reader.readLine();
        double minute = Double.parseDouble(s);
        
        Double green = 3.00;
        Double yellow = 4.00;
        Double red = 5.00;
        minute = minute%5;
        
        if (minute<green)
        System.out.println("зелёный");
        else if (minute<yellow)
        System.out.println("жёлтый");
        else if (minute<red)
        System.out.println("красный");
        

    }
}