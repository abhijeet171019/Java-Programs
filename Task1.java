package com.training;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //1st question
        System.out.println("Enter the value of x and y");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("before swapping numbers: "+x +" "+ y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping: "+x +"  " + y);

        //2nd question
        System.out.println("Enter the number to be printed");
        int a = sc.nextInt();
        System.out.println("the number entered by the user is " + a);

        //3rd question
        System.out.println("Enter any number between 1-10");
        int b = sc.nextInt();
        int c = sc.nextInt();
        int z = b + c + 30;
        System.out.println("THe addition of the numbers is " + z);

    }
}
