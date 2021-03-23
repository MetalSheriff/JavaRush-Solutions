package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/
import java.io.*;
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String s = reader.readLine();
        int i = Integer.parseInt(s);
        String s1 = reader.readLine();
        int i1 = Integer.parseInt(s1);
        String s2 = reader.readLine();
        int i2 = Integer.parseInt(s2);
        String s3 = reader.readLine();
        int i3 = Integer.parseInt(s3);
        
        if (i>=i1 & i>=i2 & i>=i3)
        System.out.println(i);
        else if (i1>=i2 & i1>=i3 & i1>=i)
        System.out.println(i1);
        else if (i3>i & i3>=i1 & i3>=i2)
        System.out.println(i3);
        else if (i2>=i & i2>=i3 & i2>+i1)
        System.out.println(i2);
        
        
    }
}
