package com.training;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {

        //1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        for(int i = 0; i <= 10; i++){
            System.out.println(num + " X " + i + " = " + num*i);
        }

        //2

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number: ");
            int num2 = sc.nextInt();
            sum += num2;
        }
        System.out.println("Sum of all the numbers is: " + sum);
        System.out.println("Average of all the numbers is: " + sum/10);

        //3
        System.out.println("Enter the month number: ");
        int month = sc.nextInt();

        if(month == 1 || month == 3 || month ==5 || month==7 || month==9 || month ==11){
            System.out.println("31 days");
        }
        else if(month == 2){
            System.out.println("28 days");
        }
        else if(month == 4 || month==8 || month==10 || month == 12){
            System.out.println("30 days");
        }
        else{
            System.out.println("Invalid Details");
        }

        //4

        System.out.println("Enter the value of n: ");
        int n1 = sc.nextInt();
        int sum2 = 0;
        for (int i = 1; i <= n1; i++) {
            sum2 += i;
        }
        System.out.println("Sum of n natural numbers is: " + sum2);

        // 5

        long num5 = sc.nextLong();
        int count = 0;
        long sum5 = 0;
        long temp = num5;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
        while (num5 != 0) {
            sum5 = sum5 + num5 % 10;
            num5 = num5 / 10;
        }
        System.out.println("Sum of digits: " + sum5);


        //6

        System.out.print("Input first number: ");
        int a6 = sc.nextInt();
        System.out.print("Input second number: ");
        int b6 = sc.nextInt();
        System.out.print("Input third number: ");
        int c6 = sc.nextInt();
        if (a6 < b6 && b6 < c6) {
            System.out.println("INCREASING");
        } else if (a6 > b6 && b6 > c6) {
            System.out.println("DECREASING");
        } else {
            System.out.println("Neither increasing nor decreasing order");
        }

        //7
        System.out.println("Input a month number: ");
        int month7 = sc.nextInt();
        System.out.println("Input a year: ");
        int year7 = sc.nextInt();
        int days = 0;
        if(year7 % 4 == 0 && month7 == 2){
            days = 29;
        }
        else if(month7 == 2){
            days = 28;
        }
        else if(month7 == 4 || month7 == 6 || month7 == 9 || month7 == 11){
            days = 30;
        }
        else{
            days = 31;
        }
        System.out.println(month7 + " " + year7 + " has " + days + " days");

        //8

        System.out.println("Enter a year: ");
        int year8 = sc.nextInt();
        if (year8 % 4 == 0) {
            if (year8 % 100 == 0) {
                if (year8 % 400 == 0) {
                    System.out.println(year8 + " is a leap year.");
                } else {
                    System.out.println(year8 + " is not a leap year.");
                }
            } else {
                System.out.println(year8 + " is a leap year.");
            }
        } else {
            System.out.println(year8 + " is not a leap year.");
        }

        //9

        System.out.print("Input number of rows: ");
        int rows9 = sc.nextInt();
        for (int i = 1; i <= rows9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        //10

        System.out.print("Input number of rows: ");
        int rows10 = sc.nextInt();

        for (int i = 0; i < rows10; i++) {
            int number = 1;
            for(int j =0; j <= rows10 -1; j++) {


                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {

                System.out.printf("%d ", number);

                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }


        //11
        System.out.print("Input first floating point number: ");
        double num11_1 = sc.nextDouble();
        System.out.print("Input second floating point number: ");
        double num12_1 = sc.nextDouble();
        sc.close();

        if (Math.abs(num11_1 - num12_1) <= 0.01) {
            System.out.println("These numbers are the same.");
        }
        else {
            System.out.println("These numbers are different.");
        }


    }


}
