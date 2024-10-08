package com.pluralsight;
import java.util.Scanner;

public class AddressBuilder {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
                // Input f
                System.out.println("Please enter full name:");
                String name = scanner.nextLine().trim();

                System.out.println("Billing Street:");
                String billingStreet = scanner.nextLine().trim();

                System.out.println("Billing City:");
                String billingCity = scanner.nextLine().trim();

                System.out.println("Billing State:");
                String billingState = scanner.nextLine().trim();

                System.out.println("Billing Zip:");
                String billingZip = scanner.nextLine().trim();

                System.out.println("Shipping Street:");
                String shippingStreet = scanner.nextLine().trim();

                System.out.println("Shipping City:");
                String shippingCity = scanner.nextLine().trim();

                System.out.println("Shipping State:");
                String shippingState = scanner.nextLine().trim();

                System.out.println("Shipping Zip:");
                String shippingZip = scanner.nextLine().trim();

                StringBuilder address = new StringBuilder();

                address.append("Customer Name: ").append(name).append("\n");

                address.append("Billing Address:\n");
                address.append(billingStreet).append("\n");
                address.append(billingCity).append(", ").append(billingState).append(" ").append(billingZip).append("\n");

                address.append("Shipping Address:\n");
                address.append(shippingStreet).append("\n");
                address.append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZip).append("\n");

                // Output
                System.out.println("\nCustomer Information:\n" + address.toString());

                scanner.close();
            }
        }



