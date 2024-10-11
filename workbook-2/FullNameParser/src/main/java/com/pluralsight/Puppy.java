package com.pluralsight;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

    public class Puppy {
        String name;
        String breed;

        public Puppy(String name, String breed) {
            this.name = name;
            this.breed = breed;
        }

        public String toString() {
            return name + " (" + breed + ")";
        }
    }


        class PuppyList {
        public static void main(String[] args) {

            Puppy puppy1 = new Puppy("Zelalem", "pit bull");
            Puppy puppy2 = new Puppy("belay", "german shiperd");
            Puppy puppy3 = new Puppy("dagim", "Poodle");

            //list for the puppies
            ArrayList<Puppy> puppies = new ArrayList<>();
            puppies.add(puppy1);
            puppies.add(puppy2);
            puppies.add(puppy3);

            // Remove one puppy
            puppies.remove(puppy2);

            // Count the puppies
            System.out.println("Remaining puppies: " + puppies.size());

            // Print the remaining puppies
            System.out.println("Puppy list: " + puppies);

        }

    }

