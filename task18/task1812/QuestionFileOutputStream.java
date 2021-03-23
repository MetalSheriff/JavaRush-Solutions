package com.javarush.task.task18.task1812;

/* 
Расширяем AmigoOutputStream
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionFileOutputStream implements AmigoOutputStream {
    AmigoOutputStream instance;
    QuestionFileOutputStream(AmigoOutputStream instance) {
        this.instance = instance;
    }

    @Override
    public void flush() throws IOException {
        instance.flush();
    }

    @Override
    public void write(int b) throws IOException {
        instance.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        instance.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        instance.write(b,off,len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String answer = bufferedReader.readLine();
        if (answer.equals("Д")){
            instance.close();
        }
    }
}

