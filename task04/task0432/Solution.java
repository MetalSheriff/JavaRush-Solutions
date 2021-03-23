package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/
import java.io.*;
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String w = reader.readLine();
        String number = reader.readLine();
        int N = Integer.parseInt(number);
        
        while (N-->0)
        System.out.println(w);
        
        

    }
}
