package com.training;

public class TaskFive_Three {
    public static void main(String[] args) {
        String str = "     this     is Geeks     ";

        // Call the replaceAll() method
        str = str.replaceAll("\\s", "");

        System.out.println(str);
    }

}
