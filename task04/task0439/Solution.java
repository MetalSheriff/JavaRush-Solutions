package com.javarush.task.task04.task0439;

/* 
Письмо счастья
*/
import java.io.*;
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        
        for (int x = 1; x <= 10; x++)
        System.out.println(name + " любит меня.");

    }
}
