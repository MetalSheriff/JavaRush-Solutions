package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    int left;
    int top;
    int width;
    int height;
    public void initialize (int left){
        this.left = left;
        this.top = 0;
        this.width = 0;
        this.height = 0;
    }
    public void initialize (int left, int top){
        this.left = left;
        this.top = top;
        this.width = 0;
        this.height = 0;
    }
    public void initialize (int left, int top, int width){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = width;
    }
    public void initialize (int left, int top, int width, int height){
        this.left = 1;
        this.top = 2;
        this.width = 3;
        this.height = 4;
    }

    public static void main(String[] args) {

    }
}
