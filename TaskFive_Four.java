package com.training;
import java. util.Arrays;

public class TaskFive_Four {
    static boolean is_isogram(String str)
    {

        str = str.toLowerCase();
        int len = str.length();

        char arr[] = str.toCharArray();

        Arrays.sort(arr);
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "Machine";
        System.out.println(is_isogram(str1));

        String s[] = "you shall not pass".split(" ");
        String ans = "";
        for (int i = s.length - 1; i >= 0; i--) {
            ans += s[i] + " ";
        }
        System.out.println("Reversed String: " + ans);


    }
}
