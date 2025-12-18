package com.internship;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    //Solved ISSUE: Implement subtract method
    public int subtract(int a, int b) {
        return a-b;
    }
    public static void main(String[] args)
    {
        Calculator calc=new Calculator();
        System.out.println("Addition: "+calc.add(12,12));
        System.out.println("Subtraction "+calc.subtract(12,12));
    }
}
}