package com.pluralsight;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class DealershipFileManager {

    public static List<Vehicle> getInventory(String filePath) throws IOException {
        List<Vehicle> inventory = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            bufferedReader.readLine();
            String line;

            while ((line = bufferedReader.readLine()) != null) {

                String[] car = line.split(Pattern.quote("|"));

                if (car.length == 8) {
                    Vehicle vehicle = new Vehicle(
                            Integer.parseInt(car[0]),
                            Integer.parseInt(car[1]),car[2], car[3], car[4], car[5],Integer.parseInt(car[6]), Double.parseDouble(car[7])
                    );
                    inventory.add(vehicle);
                } else {
                    System.out.println("Invalid vehicle entry skipped: " + line);
                }
            }
        }

        return inventory;
    }

    public static void saveDealership(String filePath, Dealership dealership) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Write dealership information on the first line
            writer.write(dealership.getName() + "|" + dealership.getAddress() + "|" + dealership.getPhone());
            writer.newLine();

            // Write each vehicle's data
            List<Vehicle> inventory = dealership.getInventory();
            for (Vehicle vehicle : inventory) {
                writer.write(vehicle.toString());  // Ensure Vehicle.toString() formats as expected
                writer.newLine();
            }
        }
    }
}


