package com.training;

public class TaskFour_six {
    static int removeDuplicates(int arr[], int a)
    {
        if (a==0 || a==1)
            return a;

        int[] temp = new int[a];

        int q = 0;
        for (int p=0; p<a-1; p++)
            if (arr[p] != arr[p+1])
                temp[q++] = arr[p];

        temp[q++] = arr[a-1];

        for (int p=0; p<q; p++)
            arr[p] = temp[p];

        return q;
    }

    public static void main (String[] args)
    {
        int arr[] = {2,3,4,4,5,6,6,6,7,8,8};
        int a = arr.length;

        a = removeDuplicates(arr, a);
        System.out.print(a);
    }
}
