package com.pluralsight;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AgeList {

    public static void main(String[] args) {

        List<Integer> ages = new ArrayList<>();
        ages.add(26);
        ages.add(24);
        ages.add(22);

        List<Integer> timesAge = new ArrayList<>();
        for (int age : ages) {
            timesAge.add(age * 2);
        }
        Collections.sort(timesAge);

        int sum = 0;
        for (int age : timesAge) {
            sum += age;
        }
        double average = (double) sum / timesAge.size();

        System.out.println("Double Ages: " + timesAge);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }

}
