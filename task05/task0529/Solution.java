package com.javarush.task.task05.task0529;

/* 
Консоль-копилка
*/
import java.io.*;
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;
        int sum = 0;
        String text = reader.readLine();
        while (!text.equals("сумма")) {
            number = Integer.parseInt(text);
            sum += number;
            text = reader.readLine();
            System.out.println(sum);
        }
    }
}

