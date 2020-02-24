package com.rickbala.stream2me.utils;

import java.util.Random;

public class Utils {

    private Utils() { throw new IllegalStateException("Utility class"); }

    private static Random r = new Random();

    private static int getRandomNumberInRange(int min, int max) {
        return r.nextInt((max - min) + 1) + min;
    }

    public static char getRandomLetter(){
        return (char)getRandomNumberInRange(65,90);
    }

}
