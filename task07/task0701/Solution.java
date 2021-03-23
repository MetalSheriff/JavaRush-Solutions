package com.javarush.task.task07.task0701;

import java.io.IOException;

/* 
Массивный максимум
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
            }
        return null;
    }

    public static int max (int[] array) {
        int maximum = array[0];
        for(int i = 0; i < array.length; i++){
            if (array[i] > maximum){
                maximum = array[i];
            }
        }
        return maximum;
    }
}
