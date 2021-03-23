package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    int top;
    int left;
    int width;
    int height;

    public Rectangle (int left, int top, int width, int height){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }
    public Rectangle (int left, int top){
        this.left = left;
        this.top = top;
        width = 0;
        height = 0;
    }
    public Rectangle (int left, int top, int width){
        this.left = left;
        this.top = top;
        this.width = width;
        height = width;
    }
    public Rectangle(){
        left = 1;
        top = 2;
        width = 3;
        height = 4;
    }


    public static void main(String[] args) {

    }
}
