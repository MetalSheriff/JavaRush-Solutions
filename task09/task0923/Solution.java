package com.javarush.task.task09.task0923;

/* 
Гласные и согласные
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String words = reader.readLine();
        char [] letters = words.replaceAll("\\s+", "").toCharArray();
        ArrayList<Character>vowelsArray = new ArrayList<>();
        ArrayList<Character>othersSymbolsArray = new ArrayList<>();
        for (int i = 0; i < letters.length; i++){
            if (isVowel(letters[i])){
                vowelsArray.add(letters[i]);
            }
            else {
                othersSymbolsArray.add(letters[i]);
            }
        }
        for(int i = 0; i < vowelsArray.size(); i++){
            System.out.print(vowelsArray.get(i) + " ");
        }
        System.out.println();
        for(int i = 0; i < othersSymbolsArray.size(); i++) {
            System.out.print(othersSymbolsArray.get(i) + " ");
        }
    }
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}