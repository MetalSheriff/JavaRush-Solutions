package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(args[1]));

        while (fileReader.ready()) {
            String lines = fileReader.readLine();
            String[] array = lines.split(" ");
            for (int j = 0; j < array.length; j++) {
                for (int i = 0; i < array[j].length(); i++) {
                    if (Character.isDigit(array[j].charAt(i))) {
                        fileWriter.write(array[j] + " ");
                        break;
                    }
                }
            }
        }
        fileReader.close();
        fileWriter.close();
    }
}
