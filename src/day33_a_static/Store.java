package day33_a_static;

import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {

        // Call 1st Constructor.
        Food f1 = new Food("Apples");
        System.out.println(f1);

        System.out.println();

        // Call 2nd Constructor.
        Food f2 = new Food("Chips", 5);
        System.out.println(f2);

        System.out.println();

        // Call 3rd Constructor.
        Food f3 = new Food("Banana", 10, 0.99);
        System.out.println(f3);
        System.out.println("F3 total: " + f3.totalPrice);

        System.out.println("-----------------------");

        // Add all Constructors in one ArrayList.
        ArrayList<Food> foodList = new ArrayList<>();
        foodList.add(f1);
        foodList.add(f2);
        foodList.add(f3);

        // Iteration with Foreach.
        for (Food each : foodList) {
            System.out.println(each);
            System.out.println();
        }

        System.out.println("***********************");

        // Find Quantity more than 5 with Foreach.
        for (Food each : foodList) {
            if (each.quantity > 5) {
                System.out.println(each);
            }
        }

        System.out.println("#######################");

        // Can you make a new ArrayList that holds ony the Food which has unit price more than 0?
        ArrayList<Food> foodPriceNotZero = new ArrayList<>(foodList);
        System.out.println(foodPriceNotZero);
        System.out.println("***********************");
        foodPriceNotZero.removeIf(each -> each.totalPrice == 0.0);
        for (Food eachObj : foodPriceNotZero) {
            System.out.println(eachObj);
        }
    }
}