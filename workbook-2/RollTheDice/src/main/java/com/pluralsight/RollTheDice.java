package com.pluralsight;

public class RollTheDice {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int roll1;
        int roll2;

        int count2 = 0;
        int count4 = 0;
        int count6 = 0;
        int count7 = 0;

        for (int i =0; i < 100; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();

            System.out.println("Roll " + i + ": " + roll1 + " - " + roll2 + " Sum: " + (roll1 + roll2));

            switch (roll1 + roll2) {
                case 2:
                    count2++;
                    break;
                case 4:
                    count4++;
                    break;
                case 6:
                    count6++;
                    break;
                case 7:
                    count7++;
                    break;
            }
        }
        System.out.println("2: " + count2);
        System.out.println("4: " + count4);
        System.out.println("6: " + count6);
        System.out.println("7: " + count7);
    }
}
