package com.javarush.task.task04.task0424;

/* 
Три числа
*/
import java.io.*;
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        int a = Integer.parseInt(a1);
        String b1 = reader.readLine();
        int b = Integer.parseInt(b1);
        String c1 = reader.readLine();
        int c = Integer.parseInt(c1);
        
        if (a==b & a!=c) System.out.println("3");
        else if (b!=a & b==c) System.out.println("1");
        else if (c==a & c!=b) System.out.println("2");
    }
}
