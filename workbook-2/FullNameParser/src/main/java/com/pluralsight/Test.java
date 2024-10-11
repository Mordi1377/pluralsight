package com.pluralsight;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number");
        float num1 = scanner.nextFloat();

        System.out.println("Please enter 2nd number");
        float num2 = scanner.nextFloat();

        System.out.println("Possible Calculations");
        System.out.println("(A)dd");
        System.out.println("(s)ubtract");
        System.out.println("(M)ultiplay");
        System.out.println("(D)ivide");

        System.out.println("Please select an option: ");
        char choice = scanner.next().toUpperCase().charAt(0);

        double result = 0;
        System.out.println("\nResults:");

        switch (choice) {
            case 'A':
            result = num1 + num2;
            System.out.println("Addition: " + num1 + " + " + num2 + " = " + (num1 + num2));
            break;
            case 'S':
             result = num1 - num2;
             System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + (num1 - num2));
             break;
            case 'M':
                result = num1 * num2;
                System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case 'D':
                result = num1 / num2;
                System.out.println("Division: " + num1 + " / " + num2 + " = " + (num1 + num2));

        }
        scanner.close();


    }


    }



