package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileNmae = reader.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileNmae));
        int count = 0;
        while (fileReader.ready()) {
            String lines = fileReader.readLine();
            String[] array = lines.split(" ");
            count = 0;
            for (String string : words) {
                for (String word : array) {
                    if (word.equals(string)) {
                        count++;
                    }
                }
            }
            if (count == 2)
                System.out.println(lines);
        }
        reader.close();
        fileReader.close();
    }
}
