package com.pluralsight;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {

    private static Scanner inputscanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the name of story: goldilocks, hansel_and_gretel, mary_had_a_little_lamb");
        String chosenStory = inputscanner.nextLine();

        try {
            FileInputStream fis = new FileInputStream(chosenStory + ".txt");
            Scanner storyScanner = new Scanner(fis);
            while (storyScanner.hasNext()) {
                String line = storyScanner.nextLine();
                System.out.println(line);
            }
            storyScanner.close();
            fis.close();
            inputscanner.close();
        } catch (IOException e) {
            System.out.println("Problem: " + e.getMessage());
        }
    }
}
