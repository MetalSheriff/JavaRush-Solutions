package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    private String s;
    private int i;
    private double d;
    private char c;

    public Solution(String s) {
        this.s = s;
    }

    protected Solution(int i) {
        this.i = i;
    }

    Solution(double d) {
        this.d = d;
    }

    private Solution(char c) {
        this.c = c;
    }

    public static void main(String[] args) {

    }
}

