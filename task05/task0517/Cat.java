package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name = null;
    int age;
    int weight;
    String address = null;
    String color;

    public Cat (String name){
        this.name = name;
        age = 1;
        weight = 5;
        color = "standart";
    }
    public Cat (String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "standart";
    }
    public Cat (String name, int age){
        this.name = name;
        this.age = age;
        weight = 5;
        color = "standart";
    }
    public Cat (int weight, String color){
        this.weight = weight;
        this.color = color;
        age = 1;
    }
    public Cat (int weight, String color, String address){
        age = 1;
        this.weight = weight;
        this.color = color;
        this.address = address;

    }

    public static void main(String[] args) {

    }
}
