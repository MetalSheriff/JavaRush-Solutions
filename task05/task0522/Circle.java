package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle(int x){
        this.x = x;
        this.y = 1.0;
        this.radius = 10.0;
    }
    public Circle (int x, int y){
        this.x = x;
        this.y = y;
        this.radius = 10.0;
    }
    public Circle (int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public Circle (){
    }

    public static void main(String[] args) {

    }
}