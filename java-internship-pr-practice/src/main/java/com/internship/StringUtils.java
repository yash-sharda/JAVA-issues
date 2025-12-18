package com.internship;

public class StringUtils {

    // ISSUE: Method should reverse the string
    //code fix
    public static String reverse(String input) {
         if (input == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }
}
