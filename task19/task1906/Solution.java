package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = reader.readLine();
        String secondFile = reader.readLine();
        FileReader fileReader = new FileReader(firstFile);
        FileWriter fileWriter = new FileWriter(secondFile);

        reader.close();
        int j = 1, i;
        while (fileReader.ready()) {
            if (j % 2 == 0){
                i = fileReader.read();
                fileWriter.write(i);
                j++;
                continue;
            }
            i = fileReader.read();
            j++;
        }
        fileReader.close();
        fileWriter.close();
    }
}
