package com.pluralsight;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PayrollCalculator {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("employees.csv"));
            int nrOfEmployees = 0;

            while (br.readLine() != null) {
                nrOfEmployees++;
            }
            br.close();

            Employee[] employees = new Employee[nrOfEmployees - 1];

            br = new BufferedReader(new FileReader("employees.csv"));

            String line;
            br.readLine();
            int index = 0;

            while ((line = br.readLine()) != null) {
                String[] employeeData = line.split("\\|");

                employees[index] = new Employee(Integer.parseInt(employeeData[0]), employeeData[1], Double.parseDouble(employeeData[2]), Double.parseDouble(employeeData[3]));
                index++;
            }

            for (Employee e: employees) {
                e.display();
            }

            br.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void calculatorWithoutArray(String fileName) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            br.readLine();
            String line;

            while ((line = br.readLine()) != null) {
                String[] employeeData = line.split("\\|");
                Employee e = new Employee(Integer.parseInt(employeeData[0]),employeeData[1],Double.parseDouble(employeeData[2]),Double.parseDouble(employeeData[3]));
                e.display();
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
