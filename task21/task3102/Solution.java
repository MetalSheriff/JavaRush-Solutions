package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

/* 
Находим все файлы
*/

public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        List<String> list = new LinkedList<>();
        File folder = new File(root);
        Queue queue = new LinkedList();
        do {
            if(queue.size() != 0)
                folder = new File((String)queue.poll());
            for(File file : folder.listFiles()) {
                if (file.isDirectory())
                    queue.add(file.getPath());
                if (file.isFile())
                    list.add(file.getAbsolutePath());
            }
        }while (queue.size() > 0);

        return list;

    }

    public static void main(String[] args) {

    }
}
