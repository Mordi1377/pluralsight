package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class DealershipFileManager {
    public static List<Vehicle> getInventory() throws IOException {
        List<Vehicle> inventory = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("CarsInventory.txt"));
        bufferedReader.readLine();
        String line;

        while ((line = bufferedReader.readLine()) != null){
            String[] car = line.split(Pattern.quote("|"));
            Vehicle vehicle = new Vehicle(Integer.parseInt(car[0]),Integer.parseInt(car[1]), car[2], car[3], car[4], car[5], Integer.parseInt(car[6]), Double.parseDouble(car[7]));
            inventory.add(vehicle);
        }

        return inventory;
    }
}
