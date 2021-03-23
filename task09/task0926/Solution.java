package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        int[] nums5 = {1, 3, 4, 7, 12};
        int[] nums2 = {6, 11};
        int[] nums4 = {2, 5, 8, 10};
        int[] nums7 = {13, 16, 17, 19, 21, 22, 25};
        int[] nums0 = new int[0];
        ArrayList<int[]> list = new ArrayList<>();

        list.add(new int[5]);
        list.add(new int[2]);
        list.add(new int[4]);
        list.add(new int[7]);
        list.add(new int[0]);

        for (int i = 0; i < list.size(); i++) {
            Arrays.fill(list.get(i), i);
        }

        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
