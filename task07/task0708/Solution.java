package com.javarush.task.task07.task0708;

import java.util.ArrayList;

/* 
Самая длинная строка
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>(5);
        for(int i = 0; i < 5;i++) {
            String string = reader.readLine();
            strings.add(i, string);
            for(int j = 0; j < 5; j++ ) {
                if (strings.get(i).length() >= string.length()) {
                    string = strings.get(i);
                    System.out.println(string);
                }
            }
        }

    }
}
