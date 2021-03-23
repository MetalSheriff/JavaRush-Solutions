package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String year = bufferedReader.readLine();
        String name = bufferedReader.readLine();
        int yearInt = Integer.parseInt(year);
        

        System.out.println(name + " захватит мир через " + yearInt + " лет. Му-ха-ха!");
        
        

    }
}
