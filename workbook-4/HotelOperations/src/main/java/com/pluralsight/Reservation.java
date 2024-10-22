package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numOfNights;
    private boolean isWeekend;

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumOfNights() {
        return numOfNights;
    }

    public void setNumOfNights(int numOfNights) {
        this.numOfNights = numOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public Reservation(String roomType, int numOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numOfNights = numOfNights;
        this.isWeekend = isWeekend;
    }

    public double getPrice() {
        double pricePerNight;
        if (roomType.equalsIgnoreCase("King")) {
            pricePerNight = 139;
        } else if (roomType.equalsIgnoreCase("Double")) {
            pricePerNight = 124.00;
        } else {
            throw new IllegalArgumentException("Invalid room type");
        }
        if (isWeekend) {
            pricePerNight *= 1.1;
        }
        return pricePerNight * numOfNights;
    }

}

