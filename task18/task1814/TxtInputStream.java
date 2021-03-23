package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.IOException;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {

    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);
        if(!fileName.endsWith(".txt")){
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    public static void main(String[] args) throws IOException, UnsupportedFileNameException {
        TxtInputStream txt = new TxtInputStream("C:/Users/metal/OneDrive/Desktop/JavaRush/JavaRushTasks/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1805/test.txt");
    }
}

