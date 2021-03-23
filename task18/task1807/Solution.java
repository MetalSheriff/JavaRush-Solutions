package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
        int count = 0;
        while (fileInputStream.available() > 0) {
            byte data = (byte) fileInputStream.read();
            if (data == 44) {
                count++;
            }
        }
        bufferedReader.close();
        fileInputStream.close();
        System.out.println(count);
    }
}
