package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        String s = "S";
        int x = 0;
        int y = 0;
        while (x<10){
            while(y<10){
                System.out.print(s);
                y++;
            }
            y = 0;
            System.out.println();
            x++;
        }
    }
}
