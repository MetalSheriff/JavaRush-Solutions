package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();

        FileInputStream inputStream1 = new FileInputStream(name1);
        byte[] bytes = new byte[inputStream1.available()];
        inputStream1.read(bytes);

        FileInputStream inputStream2 = new FileInputStream(name2);
        FileOutputStream outputStream1 = new FileOutputStream(name1);

        while (inputStream2.available()>0){
            outputStream1.write(inputStream2.read());
        }

        outputStream1.write(bytes);


        reader.close();
        inputStream1.close();
        outputStream1.close();
        inputStream2.close();
    }
}