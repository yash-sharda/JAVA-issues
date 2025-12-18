package com.internship;

public class StringUtils {

    // Fix: Method reverses the string
    public static String reverse(String input) {
        if (input == null) return null; // handle null input
        return new StringBuilder(input).reverse().toString();
    }
}
