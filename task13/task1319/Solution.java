package com.javarush.task.task13.task1319;

/* 
Писатель в файл с консоли
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.print("Start of the program");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter("Sorokin.txt"));


        try {
            while (true) {
                String forWrite = reader.readLine();
                if (forWrite.equals("exit")) {
                    writer.write(forWrite + '\n');
                    break;
                }
                writer.write(forWrite + '\n');

            }
            reader.close();
            writer.close();
            System.out.print("Файл создан");
        }

        catch (FileNotFoundException f) {
            f.printStackTrace();
        }
        System.out.print("File completed");
    }
}
