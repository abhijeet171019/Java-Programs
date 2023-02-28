package com.training;

import java.util.Scanner;

public class TaskFive_one {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numwords = scan.nextInt();
        scan.skip(" ");
        String sentence = scan.nextLine();

        String[] words = sentence.split(" ");
        String shortestword = words[0];
        for (int i = 1; i < numwords; i++) {
            if (words[i].length() < shortestword.length()) {
                shortestword = words[i];

            }
        }
        System.out.println(shortestword.length());
    }
}
