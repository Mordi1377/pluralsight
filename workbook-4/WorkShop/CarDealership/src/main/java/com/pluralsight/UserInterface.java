package com.pluralsight;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
public class UserInterface {

    private Dealership dealership;
    private Scanner scanner = new Scanner(System.in);

    public UserInterface(String filePath) {

        try {
            List<Vehicle> inventory = DealershipFileManager.getInventory(filePath);
            this.dealership = new Dealership("M & N Used Cars", "3050 Richmond blvd Rd", "811-555-5555");
            for (Vehicle vehicle : inventory) {
                dealership.addVehicle(vehicle);
            }
        } catch (IOException e) {
            System.out.println("Error loading dealership: " + e.getMessage());
        }
    }

    public void display() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. List all vehicles");
            System.out.println("2. Search by price range");
            System.out.println("3. Search by make and model");
            System.out.println("4. Search by year range");
            System.out.println("5. Search by color");
            System.out.println("6. Search by mileage range");
            System.out.println("7. Search by type");
            System.out.println("99. Quit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    processGetAllVehiclesRequest();
                    break;
                case 2:
                    processGetByPriceRequest();
                    break;
                case 3:
                    processGetByMakeModelRequest();
                    break;
                case 4:
                    processGetByYearRequest();
                    break;
                case 5:
                    processGetByColorRequest();
                    break;
                case 6:
                    processGetByMileageRequest();
                    break;
                case 7:
                    processGetByVehicleTypeRequest();
                    break;
                case 99:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
    private void displayVehicles(List<Vehicle> vehicles) {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles found.");
        } else {
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle);
            }
        }
    }

    public void processGetByPriceRequest() {
        System.out.println("Enter minimum price:");
        double min = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter maximum price:");
        double max = scanner.nextDouble();
        scanner.nextLine();
        List<Vehicle> vehicleList = dealership.getVehiclesByPrice(min, max);
        displayVehicles(vehicleList);
    }

    public void processGetByMakeModelRequest() {
        System.out.println("Enter make:");
        String make = scanner.nextLine();
        System.out.println("Enter model:");
        String model = scanner.nextLine();
        List<Vehicle> vehicleList = dealership.getVehiclesByMakeModel(make, model);
        displayVehicles(vehicleList);
    }

    public void processGetByYearRequest() {
        System.out.println("Enter minimum year:");
        int min = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter maximum year:");
        int max = scanner.nextInt();
        scanner.nextLine();
        List<Vehicle> vehicleList = dealership.getVehiclesByYear(min, max);
        displayVehicles(vehicleList);
    }

    public void processGetByColorRequest() {
        System.out.println("Enter color:");
        String color = scanner.nextLine();
        List<Vehicle> vehicleList = dealership.getVehiclesByColor(color);
        displayVehicles(vehicleList);
    }

    public void processGetByMileageRequest() {
        System.out.println("Enter minimum mileage:");
        int min = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter maximum mileage:");
        int max = scanner.nextInt();
        scanner.nextLine();
        List<Vehicle> vehicleList = dealership.getVehiclesByMileage(min, max);
        displayVehicles(vehicleList);
    }

    public void processGetByVehicleTypeRequest() {
        System.out.println("Enter vehicle type:");
        String type = scanner.nextLine();
        List<Vehicle> vehicleList = dealership.getVehiclesByType(type);
        displayVehicles(vehicleList);
    }

    public void processGetAllVehiclesRequest() {
        List<Vehicle> vehicleList = dealership.getInventory();
        displayVehicles(vehicleList);
    }

    public void processAddVehicleRequest() {
        System.out.println("Enter VIN:");
        int vin = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter year:");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter make:");
        String make = scanner.nextLine();
        System.out.println("Enter model:");
        String model = scanner.nextLine();
        System.out.println("Enter vehicle type:");
        String vehicleType = scanner.nextLine();
        System.out.println("Enter color:");
        String color = scanner.nextLine();
        System.out.println("Enter odometer reading:");
        int odometer = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter price:");
        double price = scanner.nextDouble();
        scanner.nextLine();

        Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
        dealership.addVehicle(vehicle);

        try {
            DealershipFileManager.saveDealership("CarsInventory.txt", dealership);
            System.out.println("Vehicle added and saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving vehicle: " + e.getMessage());
        }
    }

    public void processRemoveVehicleRequest() {
        System.out.println("Enter VIN of the vehicle to remove:");
        int vin = scanner.nextInt();
        scanner.nextLine();
        boolean removed = dealership.removeVehicle(vin);

        if (removed) {
            try {
                DealershipFileManager.saveDealership("CarsInventory.txt", dealership);
                System.out.println("Vehicle removed and inventory saved successfully.");
            } catch (IOException e) {
                System.out.println("Error saving inventory: " + e.getMessage());
            }
        } else {
            System.out.println("Vehicle with VIN " + vin + " not found.");
        }
    }
}


