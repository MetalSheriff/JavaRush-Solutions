package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name = null;
    int age;
    int weight;
    String color;
    String address = null;

    public void initialize (String name){
        this.name = name;
        this.age = 1;
        this.weight = 5;
        this.color = "classic";
    }
    public void initialize (String name,int weight,int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "classic";
    }
    public void initialize (String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 5;
        this.color = "classic";
    }
    public void initialize (int weight, String color) {
        this.color = color;
        this.weight = weight;
        this.age = 1;
    }
    public void initialize (int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 1;

    }

    public static void main(String[] args) {

    }
}