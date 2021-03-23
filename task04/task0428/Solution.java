package com.javarush.task.task04.task0428;

/* 
Положительное число
*/
import java.io.*;
public class Solution {
    public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String n1 = reader.readLine();
        int i1 = Integer.parseInt(n1);
        String n2 = reader.readLine();
        int i2 = Integer.parseInt(n2);
        String n3 = reader.readLine();
        int i3 = Integer.parseInt(n3);
        
        int x = 0;
        
        if (i1>0)
        x++;
        if (i2>0)
        x++;
        if (i3>0) 
        x++;
        System.out.println(x);
        
        

    }
}
