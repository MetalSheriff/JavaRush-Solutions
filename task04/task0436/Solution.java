package com.javarush.task.task04.task0436;

/* 
Рисуем прямоугольник
*/
import java.io.*;
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String high = reader.readLine();
        int m = Integer.parseInt(high);
        String wide = reader.readLine();
        int n = Integer.parseInt(wide);
        for(int i = 1; i <= m ;i++){
            for(int i1 = 1; i1 <= n; i1++){
                System.out.print("8");
        }
            System.out.println();
        }
    }
}
