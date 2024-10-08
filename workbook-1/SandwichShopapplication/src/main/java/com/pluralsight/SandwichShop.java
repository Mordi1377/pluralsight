import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Size of your sandwich:");
        System.out.println("1: Regular ($5.45)");
        System.out.println("2: Large ($8.95)");
        System.out.print("Enter 1 or 2: ");
        int sizeChoice = scanner.nextInt();

        double basePrice;
        if (sizeChoice == 1) {
            basePrice = 5.45;
        } else if (sizeChoice == 2) {
            basePrice = 8.95;
        } else {
            System.out.println("Invalid selection.");
            return;
        }

        System.out.print("Do you want a loaded sandwich (double everything)? Enter Y for yes or N for no: ");
        char loadedChoice = scanner.next().toUpperCase().charAt(0);
        if (loadedChoice == 'Y') {
            basePrice *= 2;
        }

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        double discount = 0.0;
        if (age <= 17) {
            discount = 0.10;
        } else if (age >= 65) {
            discount = 0.20;
        }

        double finalPrice = basePrice - (basePrice * discount);
        System.out.printf("The cost of your sandwich is: $%.2f%n", finalPrice);

        scanner.close();
    }
}
