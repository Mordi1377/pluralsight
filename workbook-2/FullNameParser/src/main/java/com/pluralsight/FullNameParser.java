package com.pluralsight;
import java.util.Scanner;
public class FullNameParser {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter Your Full Name:");
        String fullName = scanner.nextLine().trim();

        String[] nameParts = fullName.split(" ");

        String firstName = "";
        String middleName = "(none)";
        String lastName = "";

        if(nameParts.length == 2) {
            firstName = nameParts[0];
            lastName = nameParts[1];
        } else if(nameParts.length ==3) {
            firstName = nameParts[0];
            middleName = nameParts[1];
            lastName = nameParts[2];
        } else {
            System.out.println("Invalid input!");
        }

        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);

        scanner.close();
    }
}
