package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;
import java.nio.Buffer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = reader.readLine();
        String secondName = reader.readLine();

        BufferedReader fileReader = new BufferedReader(new FileReader(firstFile));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(secondName));


        while (fileReader.ready()){
            String text = fileReader.readLine().replaceAll("\\.","!");
            fileWriter.write(text);

        }
        reader.close();
        fileReader.close();
        fileWriter.close();
    }
}
