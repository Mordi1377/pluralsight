package com.pluralsight;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
public class Dealership {

    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone, ArrayList<Vehicle> inventory) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

//    public List<Vehicle> getAllVehicles() throws IOException {
//
//        List<Vehicle>allVehicle = DealershipFileManager.getInventory();
//        for (int i=0; i<allVehicle.size(); i++) {
//            Vehicle vehicle = allVehicle.get(i);
//        }

//        return allVehicle;

    public List<Vehicle> getVehiclesByPrice(double min, double max) {
        return null;
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {
        return null;  // Stub
    }

    public List<Vehicle> getVehiclesByYear(int minYear, int maxYear) {
        return null;
    }

    public List<Vehicle> getVehiclesByColor(String color) {
        return null;
    }

    public List<Vehicle> getVehiclesByMileage(int min, int max) {
        return null;
    }

    public List<Vehicle> getVehiclesByType(String vehicleType) {
        return null;
    }



}
