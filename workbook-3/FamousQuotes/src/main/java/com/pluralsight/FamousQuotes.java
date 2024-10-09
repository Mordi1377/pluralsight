package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    private static String[] quotes = {

            "You must be the change you wish to see in the world.",
            "If life were predictable it would cease to be life, and be without flavor.",
            "The greatest glory in living lies not in never falling, but in rising every time we fall.",
            "Darkness cannot drive out darkness: only light can do that. Hate cannot drive out hate: only love can do that.",
            "Do not go where the path may lead, go instead where there is no path and leave a trail.",
            "Be yourself; everyone else is already taken.",
            "The meaning of life is to find your gift. The purpose of life is to give it away.",
            "It is every man's obligation to put back into the world at least the equivalent of what he takes out of it.",
            "We make a living by what we get. We make a life by what we give.",
            "It takes courage to grow up and become who you really are."
    };

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String anotherQuote;
        do {
            System.out.println("Please enter a number between 1 - 10 to see a quote:");
            String input = scanner.nextLine();
            try {
                int entry = Integer.parseInt(input);
                System.out.println(quotes[entry - 1]);
            } catch (Exception e) {
                System.out.println("Invalid choice! Please enter a number between 1 and 10!");
            }

            System.out.println("Would you like to see another quote? Y/N");
            anotherQuote = scanner.nextLine().toUpperCase();
        } while (anotherQuote.equals("Y"));


    }
}
