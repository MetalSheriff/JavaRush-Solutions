package com.javarush.task.task18.task1801;

/* 
Максимальный байт
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = inputReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);

        ArrayList<Integer> bytes = new ArrayList<>();

        while (fileInputStream.available()>0){
            bytes.add(fileInputStream.read());
        }
        fileInputStream.close();
        System.out.println(Collections.max(bytes));
    }
}
