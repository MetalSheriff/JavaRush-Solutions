package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandfather60 = new Human("Anatoliy",true, 60 );
        Human grandfather65 = new Human("Vasiliy", true, 65 );
        Human grandmother55 = new Human("Olga", false, 55);
        Human grandmother50 = new Human("Lyudmila", false, 50);

        Human father = new Human("Sergei", true, 28, grandfather60, grandmother50);
        Human mother = new Human("Natalia", false, 30, grandfather65, grandmother55);

        Human son2 = new Human("Miron", true, 2,  father, mother);
        Human son3 = new Human("Kirill", true, 3, father, mother);
        Human daughter = new Human("Anastasia", false, 1, father, mother);
        Human[] human = new Human[] {grandfather60, grandfather65, grandmother55, grandmother50, father, mother, son2,son3, daughter};
        for( Human h : human) System.out.println(h);

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
        
        public Human(String name, boolean sex, int age) {
           this.name = name;
           this.sex = sex;
           this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother) {
           this.name = name;
           this.sex = sex;
           this.age = age;
           this.father = father;
           this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}