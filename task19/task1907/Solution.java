package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        bufferedReader.close();
        BufferedReader reader = new BufferedReader(new FileReader(name));
        String string = "";

        while (reader.ready()) {
            string = string + " " + reader.readLine();
        }
        String[] words = string.split("[^a-zA-Z0-9]+");
        int count = 0;
        for (String strings : words) {
            if (strings.toLowerCase().equals("world")) {
                count++;
            }
        }
        System.out.println(count);

        reader.close();
    }
}
