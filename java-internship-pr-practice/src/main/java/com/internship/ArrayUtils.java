package com.internship;

public class ArrayUtils {

    //Solved ISSUE: Return maximum element from array
    public static int findMax(int[] arr)
        //base case..
        if (arr==null || arr.length==0)
        {
            throw new IllegalArgumentException("Array is empty");
        }

        int max=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
        int[] arr={1,12,3,20,21};
        System.out.println("Maximum "+findMax(arr));
    }
    }
}
