package com.internship;

public class StringUtils {

    //Solved ISSUE: Method should reverse the string
    public static String reverse(String input) {
        //base case..
        if(input==null)
        {
            return null;
        }
        
        String rev="";
        for(int i=input.length()-1;i>=0;i--)
        {
            rev+=input.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args)
    {
        String str="Mayuri";
        System.out.println("Original string: "+str);
        System.out.println("Reversed string: "+reverse(str));
    }
}