package com.pluralsight;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
public class UserInterface {

    private Dealership dealership;

    public UserInterface(String filePath) {

        try {
            List<Vehicle> inventory = DealershipFileManager.getInventory(filePath);
                this.dealership = new Dealership("M & N Used Cars", "3050 Richmond blvd Rd", "811-555-5555");
                for (Vehicle vehicle : inventory) {
                    dealership.addVehicle(vehicle);
                }
            } catch(IOException e){
                System.out.println("Error loading dealership: " + e.getMessage());
            }
        }

        public void display () {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Menu:");
                System.out.println("1. List all vehicles");
                System.out.println("99. Quit");
                System.out.println("Enter choice: ");
            }
        }
    }

