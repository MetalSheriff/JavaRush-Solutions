package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1, file2, file3;
        try {
            file1 = reader.readLine();
            file2 = reader.readLine();
            file3 = reader.readLine();

            FileInputStream fileInput = new FileInputStream(file1);
            FileOutputStream fileOutput2 = new FileOutputStream(file2);
            FileOutputStream fileOutput3 = new FileOutputStream(file3);

            byte[] data = (new byte[fileInput.available()]);
            int count = fileInput.read(data);
            int end = count / 2;

            if (count % 2 != 0){
                end++;
            }
            fileOutput2.write(data, 0, end);
            fileOutput3.write(data, end, count - end);

            fileOutput2.close();
            fileOutput3.close();
            fileInput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
