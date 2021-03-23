package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String name = bufferedReader.readLine();
        
        String smoney = bufferedReader.readLine();
        int money = Integer.parseInt(smoney);
        
        String zyear = bufferedReader.readLine();
        int year = Integer.parseInt(zyear);
        

        System.out.println(name + " получает " + smoney + " через " + zyear + " лет.");

    }
}
