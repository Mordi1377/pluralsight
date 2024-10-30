package com.pluralsight;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Dealership {

    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Vehicle> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Vehicle> inventory) {
        this.inventory = inventory;
    }

    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    // Filter vehicles by price range
    public List<Vehicle> getVehiclesByPrice(double min, double max) {
        List<Vehicle> matchingVehicles = new ArrayList<>();
        for (Vehicle v : inventory) {
            if (v.getPrice() >= min && v.getPrice() <= max) {
                matchingVehicles.add(v);
            }
        }
        return matchingVehicles;
    }

    // Filter vehicles by make and model
    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {
        List<Vehicle> matchingVehicles = new ArrayList<>();
        for (Vehicle v : inventory) {
            if (v.getMake().equalsIgnoreCase(make) && v.getModel().equalsIgnoreCase(model)) {
                matchingVehicles.add(v);
            }
        }
        return matchingVehicles;
    }

    // Filter vehicles by year range (corrected minYear and maxYear variables)
    public List<Vehicle> getVehiclesByYear(int minYear, int maxYear) {
        List<Vehicle> matchingVehicles = new ArrayList<>();
        for (Vehicle v : inventory) {
            if (v.getYear() >= minYear && v.getYear() <= maxYear) {  // Corrected variable names
                matchingVehicles.add(v);
            }
        }
        return matchingVehicles;
    }

    // Filter vehicles by color
    public List<Vehicle> getVehiclesByColor(String color) {
        List<Vehicle> matchingVehicles = new ArrayList<>();
        for (Vehicle v : inventory) {
            if (v.getColor().equalsIgnoreCase(color)) {
                matchingVehicles.add(v);
            }
        }
        return matchingVehicles;
    }

    // Filter vehicles by mileage range
    public List<Vehicle> getVehiclesByMileage(int min, int max) {
        List<Vehicle> matchingVehicles = new ArrayList<>();
        for (Vehicle v : inventory) {
            if (v.getMileage() >= min && v.getMileage() <= max) {
                matchingVehicles.add(v);
            }
        }
        return matchingVehicles;
    }

    // Filter vehicles by type
    public List<Vehicle> getVehiclesByType(String vehicleType) {
        List<Vehicle> matchingVehicles = new ArrayList<>();
        for (Vehicle v : inventory) {
            if (v.getVehicleType().equalsIgnoreCase(vehicleType)) {
                matchingVehicles.add(v);
            }
        }
        return matchingVehicles;
    }

    // Remove vehicle by VIN using an Iterator for safe removal
    public boolean removeVehicle(int vin) {
        Iterator<Vehicle> iterator = inventory.iterator();
        while (iterator.hasNext()) {
            Vehicle vehicle = iterator.next();
            if (vehicle.getVin() == vin) {
                iterator.remove();
                return true;  // Vehicle removed successfully
            }
        }
        return false;  // Vehicle not found
    }
}


