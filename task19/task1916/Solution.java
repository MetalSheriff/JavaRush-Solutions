package com.javarush.task.task19.task1916;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader1 = new BufferedReader(new FileReader(bufferedReader.readLine()));
        BufferedReader fileReader2 = new BufferedReader(new FileReader(bufferedReader.readLine()));
        ArrayList<String> textLines1 = new ArrayList<>();
        ArrayList<String> textLines2 = new ArrayList<>();
        while (fileReader1.ready()) {
            textLines1.add(fileReader1.readLine());
        }
        while (fileReader2.ready()) {
            textLines2.add(fileReader2.readLine());
        }
        int i = 0;
        int j = 0;

        while ((i < textLines1.size()) && (j < textLines2.size())) {
            if (textLines1.get(i).equals(textLines2.get(j))) {
                lines.add(new LineItem(Type.SAME, textLines1.get(i)));
                i++;
                j++;
            } else if (j + 1 < textLines2.size() && textLines1.get(i).equals(textLines2.get(j + 1))) {
                lines.add(new LineItem(Type.ADDED, textLines2.get(j)));
                j++;
            } else if (i + 1 < textLines1.size() && textLines2.get(j).equals(textLines1.get(i + 1))){
                lines.add(new LineItem(Type.REMOVED, textLines1.get(i)));
                i++;
            }
        }
        while (i < textLines1.size()){
            lines.add(new LineItem(Type.REMOVED, textLines1.get(i)));
            i++;
        }
        while (j < textLines2.size()){
            lines.add(new LineItem(Type.ADDED, textLines2.get(j)));
            j++;
        }
        for (LineItem item : lines){
            System.out.println(item.type.toString() + " " + item.line);
        }
        bufferedReader.close();
        fileReader1.close();
        fileReader2.close();
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
