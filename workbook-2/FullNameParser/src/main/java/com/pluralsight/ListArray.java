package com.pluralsight;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class ListArray {

    public static void main(String[] args) {

        List<String> favList = new ArrayList<>();

        favList.add("Teresash woye");
        favList.add("Yesew qine");
        favList.add("Libe");
        favList.add("Amen");

        favList.remove("Libe");

        Collections.sort(favList);

        System.out.println("Here is Favorite Song: " +  favList);

    }
}
