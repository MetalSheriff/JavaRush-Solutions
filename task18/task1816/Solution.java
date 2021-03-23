package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        FileInputStream fileInputStream = new FileInputStream(fileName);
        char[] alphabet = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int count = 0;
        while(fileInputStream.available()>0){
            char c = (char)fileInputStream.read();
            for(char x : alphabet){
                if(x == c){
                    count++;
                }
            }
        }
        fileInputStream.close();
        System.out.println(count);
    }
}
