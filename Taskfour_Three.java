package com.training;

public class Taskfour_Three {
    public static int getSecondSmallest(int[] a, int total){
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[1];
    }
    public static void main(String args[]) {
        int a[] = {1, 2, 10, 9, 7, 8};
        int b[] = {54, 46, 59, 87, 44, 52, 65};
        System.out.println("Second Largest: " + getSecondSmallest(a, 6));
        System.out.println("Second Largest: " + getSecondSmallest(b, 7));
    }
}
