package com.pluralsight;

import java.io.IOException;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        DealershipFileManager fileManager = new DealershipFileManager();

        try {
            List<Vehicle> inventory = DealershipFileManager.getInventory();

            System.out.println("Loaded Inventory: ");
            for (Vehicle vehicle : inventory) {
                System.out.println(vehicle);
            }
        }catch (IOException e) {
            System.out.println("Error loading inventory: " + e.getMessage());

        }
    }


}
