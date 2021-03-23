package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());
        int x;
        while (true) {
            if (b < a)
                { x = a; a = b; b = x;}
            if (c < b)
                { x = b; b = c; c = x;}
            if (d < c)
                { x = c; c = d; d = x;}
            if (e < d)
                { x = d; d = e; e = x;}
            if (a <= b && b <= c && c <= d && d <= e) break;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
