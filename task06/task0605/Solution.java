package com.javarush.task.task06.task0606;

/*
Чётные и нечётные циферки
*/
import java.io.*;
public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(reader.readLine());

        for(; x != 0; x = x / 10){
            if (x %2 == 0){
                even++;
            }
            else if (x %2 != 0){
                odd++;
            }
        }
        System.out.println("Even: " + even + " Odd: " + odd);

    }
}
