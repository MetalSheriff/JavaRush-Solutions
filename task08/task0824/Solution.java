package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> kids = new ArrayList<>();
        ArrayList<Human> child = new ArrayList<>();
        child.add(new Human("son1", true, 14, kids));
        child.add(new Human("son2", true, 16, kids));
        child.add(new Human("daughter", false, 18, kids));

        ArrayList<Human> male = new ArrayList<>();
        male.add(new Human("Father", true, 38, child));
        ArrayList<Human> female = new ArrayList<>();
        female.add(new Human("Mother", false, 37, child));

        ArrayList<Human> grannies = new ArrayList<>();
        grannies.add(new Human("GrandFather1", true, 58, male));
        grannies.add(new Human("GrandMother1",false, 57, male));
        grannies.add(new Human("GrandFather2", true, 60, female));
        grannies.add(new Human("GrandMother2", false, 59, female));

        for(Human text : child){
            System.out.println(text.toString());
        }
        for(Human text : male){
            System.out.println(text.toString());
        }
        for(Human text : female){
            System.out.println(text.toString());
        }
        for(Human text : grannies){
            System.out.println(text.toString());
        }
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;
        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
