package com.javarush.task.task15.task1522;

/* 
Закрепляем паттерн Singleton
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;
    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String somePlanet = reader.readLine();
            if(somePlanet.equals(Planet.SUN)){
                thePlanet = Sun.getInstance();
            }
            else if (somePlanet.equals(Planet.MOON)){
                thePlanet = Moon.getInstance();
            }
            else if (somePlanet.equals(Planet.EARTH)){
                thePlanet = Earth.getInstance();
            }
            else {
                thePlanet = null;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
