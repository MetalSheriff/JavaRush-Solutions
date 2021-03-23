package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = bufferedReader.readLine();
        String secondFile = bufferedReader.readLine();

        FileInputStream fileInputStream = new FileInputStream(firstFile);
        FileOutputStream fileOutputStream = new FileOutputStream(secondFile);

        BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));

        String string = reader.readLine();

        String space = " ";
        Integer temp;

        while (!string.isEmpty()) {
            if (string.contains(space)) {
                temp = (int) Math.round(Double.parseDouble(string.substring(0, string.indexOf(space))));
                fileOutputStream.write(temp.toString().getBytes());
                fileOutputStream.write(space.getBytes());
                string = string.substring(string.indexOf(space) + 1);
            }
            else {
                temp = (int)Math.round(Double.parseDouble(string));
                fileOutputStream.write(temp.toString().getBytes());
                fileOutputStream.write(space.getBytes());
                string = "";
            }
        }
        bufferedReader.close();
        fileInputStream.close();
        fileOutputStream.close();
        reader.close();

    }
}
