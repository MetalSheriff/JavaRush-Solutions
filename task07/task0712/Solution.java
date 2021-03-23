package com.javarush.task.task07.task0712;

import java.io.IOException;

/*
Самые-самые
*/
import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        for(int x = 0; x < 10; x++){
            list.add(reader.readLine());
        }

        int y = list.get(0).length(), x = list.get(0).length(), min = 0, max = 0;
        for(String s : list){
            if(s.length() > y){
                y = s.length();
            }
            if(s.length() < x){
                x = s.length();
            }
        }
        for(String s : list){
            if(s.length() == y){
                max = y;
                break;
            }
            if(s.length() == x){
                min = x;
                break;
            }
        }
        System.out.println(min < max ? list.get(x) : list.get(y));
    }
}
