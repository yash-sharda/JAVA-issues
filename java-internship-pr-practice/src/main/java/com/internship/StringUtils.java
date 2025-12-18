package com.internship;

public class StringUtils {

    // Method to reverse the string
    public static String reverse(String input) {
        if (input == null) {
            return null; // Handle null input gracefully
        }
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
}
