package com.pluralsight;
import java.util.Scanner;


public class HighScoreWins {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a game score (Home:Visitor|21:9):");
        String gameInput = scanner.nextLine().trim();

        String[] teamsAndScores = gameInput.split("\\|");

        String[] teams = teamsAndScores[0].split(":");
        String[] scores = teamsAndScores[1].split(":");


        int homeScore = Integer.parseInt(scores[0]);
        int visitorScore = Integer.parseInt(scores[1]);

        if (homeScore > visitorScore) {
            System.out.println("Winner:" + teams[0]);
        } else if (visitorScore > homeScore) {
            System.out.println("Winner:" + teams[1]);
        } else {
            System.out.println("Same score");

            scanner.close();
        }

    }
}

