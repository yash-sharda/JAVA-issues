package com.internship;

public class App {
    public static void main(String[] args) {
        System.out.println("Java Internship PR Practice Repo");
        
        int[] arr = {4, 1, 9, 3};
        System.out.println("Max: " + ArrayUtils.findMax(arr));

        Calculator calc = new Calculator();
        System.out.println("Add: " + calc.add(5, 3));
        System.out.println("Subtract: " + calc.subtract(5, 3));

        System.out.println("Reverse: " + StringUtils.reverse("internship"));
    }
}
    

