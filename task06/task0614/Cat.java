package com.javarush.task.task06.task0614;

/* 
Статические коты
*/

import java.util.ArrayList;

public class Cat {
    String name;
    public static ArrayList <Cat> cats = new ArrayList<>();

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
    }

    public static void main(String[] args) {
        for(int x = 0; x < 10; x++) {
            cats.add(new Cat());
        }
        printCats();
    }

    public static void printCats() {
        for(int y = 0; y < cats.size();y++)
            System.out.println(cats.get(y));
    }
}
