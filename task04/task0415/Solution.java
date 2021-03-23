package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/
import java.io.*;
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String s1 = reader.readLine();
        int i1 = Integer.parseInt(s1);
        
        String s2 = reader.readLine();
        int i2 = Integer.parseInt(s2);
        
        String s3 = reader.readLine();
        int i3 = Integer.parseInt(s3);
        
        if (i1+i2>i3 && i1+i3>i2 && i2+i3>i1)
        System.out.println("Треугольник существует.");
        else
        System.out.println("Треугольник не существует.");

    }
}