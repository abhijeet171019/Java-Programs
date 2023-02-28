package com.training;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        //First Question
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if (n % 3 ==0 && n % 5 == 0){
            System.out.println("Consultadd JAVA training");
        } else if (n % 3 == 0) {
            System.out.println("Consultadd");

        }else if (n % 5 == 0){
            System.out.println("JAVA Training");
        }else{
            System.out.println("Number is not divisible by 3 or 5");
        }

        //Second Question
        System.out.println(
                "Choose the following option first:\n" +
                        "1 - Addition\n" +
                        "2 - Subtraction\n" +
                        "3 - Division\n" +
                        "4 - Multiplication\n" +
                        "5 - Average\n"
        );
        int option = sc.nextInt();
        int first, second;
        switch (option) {
            case 1:
                System.out.println("Enter the first number: ");
                first = sc.nextInt();
                System.out.println("Enter the second number: ");
                second = sc.nextInt();
                System.out.println("Addition: " + (first + second));
                break;
            case 2:
                System.out.println("Enter the first number: ");
                first = sc.nextInt();
                System.out.println("Enter the second number: ");
                second = sc.nextInt();
                System.out.println("Subtraction: " + (first - second));
                break;
            case 3:
                System.out.println("Enter the first number: ");
                first = sc.nextInt();
                System.out.println("Enter the second number: ");
                second = sc.nextInt();
                System.out.println("Division: " + (first / second));
                break;
            case 4:
                System.out.println("Enter the first number: ");
                first = sc.nextInt();
                System.out.println("Enter the second number: ");
                second = sc.nextInt();
                System.out.println("Multiplication: " + (first * second));
                break;
            case 5:
                System.out.println("Enter the first number: ");
                first = sc.nextInt();
                System.out.println("Enter the second number: ");
                second = sc.nextInt();
                System.out.println("Enter the first1 number: ");
                int first1 = sc.nextInt();
                System.out.println("Enter the second2 number: ");
                int second2 = sc.nextInt();
                System.out.println("Average: " + ((first + second + first1 + second2) / 4));
                break;
            default:
                System.out.println("Invalid option");

        }


        //3rd question
        System.out.println("Write any positive number to keep going and negative to end the game");
        int a = sc.nextInt();
        while (a != 0) {
            if (a < 0) {
                System.out.println("It's Over");
                break;
            } else {
                System.out.println("Good Going");
                a = sc.nextInt();
            }
        }


        //Question 4
        for (int i = 0; i < 6; i++) {
            if (i == 3 || i == 6) {
                continue;
            }
            System.out.println("ALl the number from 0 to 6 except 3 and 6 " + i);
        }


        //Question 6
        System.out.println("Please enter number to see the answer for 6");
        int b = sc.nextInt();
        if(b%2!=0){
            System.out.println("NEW");
        }else if(b%2==0 && b>=2 && b<=5){
            System.out.println("OLD");
        }else if(b%2==0 && b>=6 && b<=30){
            System.out.println("NEW");
        }else if(b%2==0 && b>30){
            System.out.println("OLD");
        }

        //Question 7
        System.out.println("Enter the double number to see the answer to question 7");
        double num = sc.nextDouble();
        if (num == 0) {
            System.out.println("zero");
        } else if (num > 0) {
            if (num < 1) {
                System.out.println("small positive");
            } else if (num > 1000000) {
                System.out.println("large positive");
            } else {
                System.out.println("positive");
            }
        } else {
            if (num > -1) {
                System.out.println("small negative");
            } else if (num < -1000000) {
                System.out.println("large negative");
            } else {
                System.out.println("negative");
            }
        }

        //Question 8
        Scanner in = new Scanner(System.in);

        System.out.print("Input an string ");
        String input = in.next().toLowerCase();

        boolean wanted_string = input.equals("a") || input.equals("r") || input.equals("n")
                || input.equals("o") || input.equals("d") || input.equals("m");


        if (wanted_string)
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("NOt Found");
        }
    }



}

