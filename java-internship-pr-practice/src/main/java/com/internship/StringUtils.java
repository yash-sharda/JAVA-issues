package com.internship;

public class StringUtils {

    // ISSUE: Method should reverse the string
    public static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
