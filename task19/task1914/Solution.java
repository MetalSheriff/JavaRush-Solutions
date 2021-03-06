package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        System.setOut(consoleStream);
        String nextText = outputStream.toString();
        String[] arr = nextText.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[2]);
        int c = 0;
        if (arr[1].equals("+")) {
            c = a + b;
        } else if (arr[1].equals("-")) {
            c = a - b;
        } else if (arr[1].equals("*")) {
            c = a * b;
        }
        System.out.println(a + " " + arr[1] + " " + b + " = " + c);

    }


    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

