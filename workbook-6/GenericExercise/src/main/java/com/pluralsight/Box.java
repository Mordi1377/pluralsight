package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> contents = new ArrayList<>();

    public void addContent(T item) {
        contents.add(item);
    }

    public void printContents() {
        System.out.println("Box contents:");
        for (T item : contents) {
            System.out.println(item);
        }
    }
}
