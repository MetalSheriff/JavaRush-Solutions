package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private double weight;
        private String job;
        private char sex;
        private boolean relationship;
        private int salary;
    public Human (String name){
        this.name = name;
    }
    public Human (String name, double weight, char sex){
        this.name = name;
        this.weight = weight;
        this.sex = sex;
    }
    public Human (String name, double weight, String job, boolean relationship, int salary){
        this.name = name;
        this.weight = weight;
        this.job = job;
        this.relationship = relationship;
        this.salary = salary;
    }
    public Human (String name, double weight, char sex, boolean relationship){
        this.name = name;
        this.weight = weight;
        this.sex = sex;
        this.relationship = relationship;
    }
    public Human (String name, double weight, char sex, int salary){
        this.name = name;
        this.weight = weight;
        this.sex = sex;
        this.salary = salary;
    }
    public Human (String name, char sex, boolean relationship){
        this.name = name;
        this.sex = sex;
        this.relationship = relationship;
    }
    public Human (String name, boolean relationship ){
        this.name = name;
        this.relationship = relationship;
    }
    public Human (String name, double weight, char sex, String job, int salary){
        this.name = name;
        this.weight = weight;
        this.sex = sex;
        this.job = job;
        this.salary = salary;
    }
    public Human (String name, double weight, int salary){
        this.name = name;
        this.weight = weight;
        this.salary = salary;
    }
    public Human (String name, double weight, String job, char sex, boolean relationship, int salary){
        this.name = name;
        this.weight = weight;
        this.job = job;
        this.sex = sex;
        this.relationship = relationship;
        this.salary = salary;
    }
    }
}
