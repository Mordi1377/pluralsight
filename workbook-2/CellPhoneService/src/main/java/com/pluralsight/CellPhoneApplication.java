package com.pluralsight;
import java.util.Scanner;

public class CellPhoneApplication {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the serial number: ");
        int serialNumber1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the model of the phone: ");
        String model1 = scanner.nextLine();

        System.out.println("Enter the carrier: ");
        String carrier1 = scanner.nextLine();

        System.out.println("Enter the phone number: ");
        String phoneNumber1 = scanner.nextLine();

        System.out.println("Enter the owner's name: ");
        String owner1 = scanner.nextLine();

        CellPhone cellPhone1 = new CellPhone();
        cellPhone1.setSerialNumber(serialNumber1);
        cellPhone1.setModel(model1);
        cellPhone1.setCarrier(carrier1);
        cellPhone1.setPhoneNumber(phoneNumber1);
        cellPhone1.setOwner(owner1);

        System.out.println("Serial Number: " + cellPhone1.getSerialNumber());
        System.out.println("Model: " + cellPhone1.getModel());
        System.out.println("Carrier: " + cellPhone1.getCarrier());
        System.out.println("Phone Number: " + cellPhone1.getPhoneNumber());
        System.out.println("Owner: " + cellPhone1.getOwner());

        System.out.println("Enter the serial number: ");
        int serialNumber2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the model of the phone: ");
        String model2 = scanner.nextLine();

        System.out.println("Enter the carrier: ");
        String carrier2 = scanner.nextLine();

        System.out.println("Enter the phone number: ");
        String phoneNumber2 = scanner.nextLine();

        System.out.println("Enter the owner's name: ");
        String owner2 = scanner.nextLine();

        CellPhone cellPhone2 = new CellPhone();
        cellPhone1.setSerialNumber(serialNumber2);
        cellPhone1.setModel(model2);
        cellPhone1.setCarrier(carrier2);
        cellPhone1.setPhoneNumber(phoneNumber2);
        cellPhone1.setOwner(owner2);

        display(cellPhone1);
        display(cellPhone2);

        cellPhone1.dial(cellPhone1.getPhoneNumber());

        cellPhone2.dial(cellPhone2.getPhoneNumber());

        scanner.close();

    }

    public static void display(CellPhone phone) {
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("owner: " + phone.getOwner());
    }
}
