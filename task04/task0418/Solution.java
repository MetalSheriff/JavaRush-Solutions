package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/
import java.io.*;
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String s = reader.readLine();
        int i = Integer.parseInt(s);
        String s1 = reader.readLine();
        int i1 = Integer.parseInt(s1);
        
        if (i >= i1)
        System.out.println(i1);
        else if (i <= i1)
        System.out.println(i);
        else if (i==i1)
        System.out.println(i);
    
    }
}