package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                String key = reader.readLine();
                Movie movie = MovieFactory.getMovie(key);
                if (key.equals("soapOpera") || key.equals("cartoon") || key.equals("thriller")) {
                    System.out.println(movie.getClass().getSimpleName());
                } else {
                    break;
                }
            }
        }
        catch (NullPointerException n){
            n.getStackTrace();
        }
    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            if (key.equals("soapOpera")) {
                movie = new SoapOpera();
            } else if (key.equals("cartoon")) {
                movie = new Cartoon();
            } else if (key.equals("thriller")) {
                movie = new Thriller();
            }

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {
    }

    static class Thriller extends Movie {
    }
}
