package com.javarush.task.task04.task0437;

/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++){
            for (int y = x; y > 0; y--){
                System.out.print("8");
            }
            System.out.println();
        }

    }
}
