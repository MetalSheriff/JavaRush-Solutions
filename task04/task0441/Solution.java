package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/
import java.io.*;
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String number1 = reader.readLine();
        int n1 = Integer.parseInt(number1);
        String number2 = reader.readLine();
        int n2 = Integer.parseInt(number2);
        String number3 = reader.readLine();
        int n3 = Integer.parseInt(number3);

        if  (n1 > n2 && n2 > n3 || n3 > n2 && n2 > n1)
            System.out.println(n2);
        else if (n2 > n1 && n1 > n3 || n3 > n1 && n1 > n2)
            System.out.println(n1);
        else if (n2 > n3 && n3 > n1 || n1 > n3 && n3 > n2)
            System.out.println(n3);
        else if ( n1 == n2 && n1 == n3)
            System.out.println(n1);
        else if (n1 == n2 && n1 != n3 )
            System.out.println(n1);
        else if (n1 == n3 && n1 != n2 )
            System.out.println(n1);
        else if (n3 == n2 && n3 != n1 )
            System.out.println(n3);

    }
}
