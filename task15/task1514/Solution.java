package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<>();
    static
    {
        labels.put(1.00, "Adidas");
        labels.put(2.00, "Nike");
        labels.put(3.00, "Puma");
        labels.put(4.00, "Reebok");
        labels.put(5.00, "Rockport");
    }
    public static void main(String[] args) {
        System.out.println(labels);
    }
}
