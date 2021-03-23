package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        double space = 0;
        double letters = 0;
        double result;
        while (fileInputStream.available() > 0) {
            if ((char) fileInputStream.read() == ' ') {
                space++;
            }
            letters++;
        }
        if(letters!=0) {
            result = space/ letters * 100;
            System.out.println(round(result));
        }
        fileInputStream.close();
    }
    private static double round(double value) {
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
