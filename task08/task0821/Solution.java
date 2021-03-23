package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> people = new HashMap<>();
        people.put("Sorokin", "Sergey");
        people.put("Sorokin", "Andrey");
        people.put("Ivanov", "Andrey");
        people.put("Ivanov", "Alexey");
        people.put("Smirnov", "Alexey");
        people.put("Smirnov", "Dmitry");
        people.put("Sidorov", "Dmitry");
        people.put("Sidorov", "Ivan");
        people.put("Petrov", "Ivan");
        people.put("Petrov", "Sergey");

        return people;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
