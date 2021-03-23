package com.javarush.task.task09.task0922;

/* 
Какое сегодня число?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat dF = new SimpleDateFormat("yyyy-MM-d");
        Date date = dF.parse(reader.readLine());
        System.out.println(new SimpleDateFormat("MMM d, yyyy").format(date).toUpperCase());

    }
}
