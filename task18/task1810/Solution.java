package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import javax.swing.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            FileInputStream fileInputStream = new FileInputStream(reader.readLine());

            if (fileInputStream.available() < 1000) {
                fileInputStream.close();
                throw new DownloadException();
            }
            else {
                int data = fileInputStream.read();
            }
            fileInputStream.close();
        }
    }

    public static class DownloadException extends Exception {

    }
}
