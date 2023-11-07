package day21_arrays;

import java.util.*;

public class Store {
    public static void main(String[] args) {

        String[] items = {"Shoes", "Jackets", "Gloves", "Airpods", "IPhones"};

        // Do we have a Jacket in the store?
        boolean hasJacket = false;

        // Here we just did simple String method chaining and check if it contains.
        System.out.println(Arrays.toString(items).toLowerCase().contains("jacket"));

        // With loop
        // {"Shoes", "Jackets", "Gloves", "Airpods", "IPhones"};
        for (String each : items) {
            if (each.equalsIgnoreCase("gloves")) {
                hasJacket = true;
                break;
            }
        }

        System.out.println("______________________________________");

        if (hasJacket) {
            System.out.println("We have it");
        } else {
            System.out.println("We do not have it");
        }
        System.out.println(hasJacket ? "We have it" : "We do not have it");

        System.out.println(Arrays.toString(items).toLowerCase().contains("jacket") ? "We have it" : "We do not have it");

    }
}
