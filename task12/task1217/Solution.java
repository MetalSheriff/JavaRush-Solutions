package com.javarush.task.task12.task1217;

/* 
Лететь, бежать и плыть
*/

public class Solution {
    public static void main(String[] args) {

    }

public interface CanFly{
    void wings(int on, int off);
}
public interface CanRun{
    void move(String a, String b);
}
public interface CanSwim{
    void swimTo (String newAddress);
}

}
