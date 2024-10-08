package com.pluralsight;

import java.util.Locale;
import java.util.Scanner;

public class RentalCarCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pickup Date");
        String pickupDate = scanner.nextLine();

        System.out.println("Number of Rental Days");
        int rentalDays = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Do you want electronic toll tag its $3.95/day? (y/n)");
        String tollTag = scanner.nextLine().toLowerCase();

        System.out.println("Do you want a GPS at $2.95/day? (y/n)");
        String gps = scanner.nextLine().toLowerCase();

        System.out.println("Do you want roadside assistance at $3.95/day? (y/n)");
        String roadAssistance = scanner.nextLine().toLowerCase();

        System.out.println("Your Age? ");
        int age = scanner.nextInt();

        double basicCarRental = 29.99 * rentalDays;

        double tollTagCoast = 0;
        double gpsCoast = 0;
        double roadAssistanceCoast = 0;


        if (tollTag.equals("y")) {
            tollTagCoast = 3.95 * rentalDays;
        }
        if (gps.equals("y")) {
            gpsCoast = 2.95 * rentalDays;
        }
        if (roadAssistance.equals("y")) {
            roadAssistanceCoast = 3.95 * rentalDays;
        }

        double cost = tollTagCoast + gpsCoast + roadAssistanceCoast;

        System.out.println("Options Cost $" + cost);

        double underAgeCharge = 0;
        if (age < 25) {
            underAgeCharge = 0.3 * basicCarRental;
        }

        System.out.println("\n--- Rental Cost Breakdown ---");
        System.out.println("Pickup Date: " + pickupDate);
        System.out.printf("Basic Rental Cost: $%.2f%n", basicCarRental);
        System.out.printf("Options Cost: $%.2f%n", cost);

        double totalCost = basicCarRental + cost + underAgeCharge;

        System.out.printf("Total Cost: $%.2f%n", totalCost);

        scanner.close();
    }
}


