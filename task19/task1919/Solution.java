package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        Map<String, Double> salary = new TreeMap<String, Double>();
        while (bufferedReader.ready()){
            String line = bufferedReader.readLine();
            String[] keyvalue = line.split(" ");
            String key = keyvalue[0];
            Double value = Double.parseDouble(keyvalue[1]);
            if (!salary.containsKey(key))
                salary.put(key, value);
            else
                salary.replace(key, salary.get(key) + value);
        }
        for (Map.Entry<String, Double> entry : salary.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        bufferedReader.close();
    }
}
