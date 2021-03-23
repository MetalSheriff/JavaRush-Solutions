package com.javarush.task.task18.task1802;

/* 
Минимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Byte.MAX_VALUE;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputStream = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(inputStream);

        ArrayList <Integer> bytes = new ArrayList<>();

        while(fileInputStream.available()>0) {
            bytes.add(fileInputStream.read());
        }
        fileInputStream.close();
        System.out.println(Collections.min(bytes));
    }

}
