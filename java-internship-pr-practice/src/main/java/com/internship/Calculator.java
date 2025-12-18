package com.internship;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    // ISSUE: Implement subtract method
    public int subtract(int a, int b) {
        return a - b;
    }

    // Implement multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    // Implement division (integer division). Throws if dividing by zero.
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }
}
