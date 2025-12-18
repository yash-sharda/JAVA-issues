package com.internship;

public class StringUtils {

    // Correct implementation: reverse the string
    public static String reverse(String input) {
        if (input == null) {
            return null; // handle null input safely
        }
        return new StringBuilder(input).reverse().toString();
    }
}
