package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Room room = new Room (2, 100, false, false);
        System.out.println(room.isAvailable());

        Reservation reservation = new Reservation("king", 5, false);
        System.out.println(reservation.getPrice());

        Employee employee = new Employee(1, "Mordecai", "Database", 50, 45);
        System.out.println(employee.getTotalPay());
    }
}
