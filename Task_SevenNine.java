package com.training;

public class Task_SevenNine {
    static int arr[] = {109, 24, 445, 50, 1089};

    // Method to find maximum in arr[]
    static int largest()
    {
        int i;

        int max = arr[0];

        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }


    public static void main(String[] args)
    {
        System.out.println("Largest in given array is " + largest());
    }
}
