package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/
import java.io.*;
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String number = reader.readLine();
        int n = Integer.parseInt(number);
        
        boolean a = (n%2==0);
        boolean b = (n>0 && n<10);
        boolean c = (n>=10 && n<=99);
        boolean d = (n>=100 && n<=999);
        
        if (a && b) System.out.println("четное однозначное число");
        else if (!a && b) System.out.println("нечетное однозначное число");
        else if (a && c) System.out.println ("четное двузначное число");
        else if (!a && c) System.out.println ("нечетное двузначное число");
        else if (a && d) System.out.println ("четное трехзначное число");
        else if (!a && d) System.out.println ("нечетное трехзначное число");
    }
}
