package com.training;
import java.util.Scanner;


public class String_reverse {
    public static void main(String[] args) {
        String str = "Abhijeet" , rev_str = "";
        char ch;
        System.out.println("original word: ");
        System.out.println("Abhijeet");

        for(int i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            rev_str = ch + rev_str;
        }
        System.out.println("Reversed string " + rev_str);
    }
}
