package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Box<Laptop> laptopBox = new Box<>();
        laptopBox.addContent(new Laptop("Toshiba Core i3"));
        laptopBox.addContent(new Laptop("MacBook pro"));

        Box<Book> bookBox = new Box<>();
        bookBox.addContent(new Book("Rich dad Poor dad"));
        bookBox.addContent(new Book("Robert T.Kiyosaki"));

        laptopBox.printContents();
        bookBox.printContents();

        System.out.println("Laptop Box:");
        laptopBox.printContents();

        System.out.println("\nBook Box:");
        bookBox.printContents();

    }
}
