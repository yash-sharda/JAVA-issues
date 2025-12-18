package com.internship;

public class App {
    public static void main(String[] args) {
        System.out.println("Java Internship PR Practice Repo");
        System.out.println("Testing StringUtils:");
        System.out.println(StringUtils.reverse("hello"));
        System.out.println(StringUtils.reverse("Java"));
        System.out.println("Testing ArrayUtils:");
        int[] numbers = { 5, 2, 9, 1, 7 };
        System.out.println("Max: " + ArrayUtils.findMax(numbers));
    }
}
