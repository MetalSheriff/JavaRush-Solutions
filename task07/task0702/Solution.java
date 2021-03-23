package com.javarush.task.task07.task0702;

/* 
Массив из строчек в обратном порядке
*/
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] array = new String[10];
        for (int i = 0; i < array.length - 1;i++) {
            array[i] = reader.readLine();
        }
        for (int j = 9; j >= 0; j--) {
            System.out.println(array[j]);
        }
    }
}