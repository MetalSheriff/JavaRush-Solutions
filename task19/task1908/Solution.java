package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String firstFileName = bufferedReader.readLine();
        String secondFileName = bufferedReader.readLine();

        BufferedReader fileReader = new BufferedReader(new FileReader(firstFileName));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(secondFileName));


        while (fileReader.ready()) {

            String[] numbers = fileReader.readLine().split(" ");
            for (String strings : numbers) {
                if(strings.matches("\\d+")) {
                    fileWriter.write(strings + " ");
                }
            }
        }
        fileReader.close();
        fileWriter.close();
        bufferedReader.close();
    }
}
