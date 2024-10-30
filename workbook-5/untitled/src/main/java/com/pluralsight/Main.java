package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Shape s1 = new Shape();
        Shape s2 = new Square(4 );
        Shape s3 = new Circle(2 );

        System.out.println(s2.calculateArea());

        System.out.println(((Circle) s3).getRadius());

        if (s3 instanceof Circle c) {
            System.out.println(c.getRadius());
        } else {
            System.out.println("Im not a circle");
        }

        System.out.println(s2.getClass().getSimpleName());


    }
}

