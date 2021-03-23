package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1 = new FileInputStream(reader.readLine());
        FileOutputStream file2 = new FileOutputStream(reader.readLine());
        reader.close();
        ArrayList<Byte> buffer = new ArrayList<>();
        while (file1.available() > 0) {
            buffer.add((byte) file1.read());
        }
        for (int i = buffer.size() - 1; i >= 0; i--) {
            file2.write(buffer.get(i));
        }
        file1.close();
        file2.close();
    }
}
