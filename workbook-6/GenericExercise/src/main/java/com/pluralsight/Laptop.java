package com.pluralsight;

public class Laptop {
    private String model;

    public Laptop(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Laptop: " + model;
    }
}

class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book: " + title;
    }
}
