package com.javarush.task.task18.task1805;

/* 
Сортировка байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        while (fileInputStream.available()>0){
            int x = fileInputStream.read();
            list.add(x);
        }
        Collections.sort(list);
        bufferedReader.close();
        fileInputStream.close();

        for(int i = 0; i < list.size()-1; i++){
            if(list.get(i).equals(list.get(i+1))){
                list.remove(i);
                i--;
            }
        }
        for(Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
