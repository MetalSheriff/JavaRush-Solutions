package com.javarush.task.task05.task0532;

/* 
Задача по алгоритмам
*/
import java.io.*;
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int maximum;
        if (N > 0)
        { maximum = Integer.parseInt(reader.readLine());
            for (int i=2; i<=N; i++)
            { int b = Integer.parseInt(reader.readLine());
                if (b >= maximum) maximum = b;
                else maximum = maximum; }
            System.out.println(maximum); }
    }
}
