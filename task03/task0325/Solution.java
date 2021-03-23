package com.javarush.task.task03.task0325;

import java.io.*;
import java.util.*;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
    String money = reader.readLine(); 
    int $money = Integer.parseInt(money); 
    System.out.print("Я буду зарабатывать $" + money + " в час");

    }
}
