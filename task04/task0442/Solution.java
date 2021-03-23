package com.javarush.task.task04.task0442;

/* 
Суммирование
*/
import java.io.*;
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true){
            String s = reader.readLine();
            int i = Integer.parseInt(s);
            sum = sum + i;
        if (i == -1)
            break;
        }
        System.out.println(sum);
    }
}
