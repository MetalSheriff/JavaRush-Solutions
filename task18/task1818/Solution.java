package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fileOutputStream = new FileOutputStream(new File(bufferedReader.readLine()), true);
        FileInputStream file1 = new FileInputStream(new File(bufferedReader.readLine()));
        FileInputStream file2 = new FileInputStream(new File(bufferedReader.readLine()));
        bufferedReader.close();

        while (file1.available() > 0) {
            int i = file1.read();
            fileOutputStream.write(i);
        }

        while (file2.available() > 0) {
            int i = file2.read();
            fileOutputStream.write(i);
        }

        file1.close();
        file2.close();
        fileOutputStream.close();
    }
}
