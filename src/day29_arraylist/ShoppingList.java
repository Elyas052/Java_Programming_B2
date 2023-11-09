package day29_arraylist;

import java.util.*;
//import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();

        // Check if shoppingList is empty or has some items.
        statusOfShoppingList(shoppingList);

        // Ask a user to enter an item to add into a shopping list and continue until user does not want to add more.
        // User will add it at least ONE time.
        askToAddItems(shoppingList);

        // Print out all the items from the list one by one
        showListItems(shoppingList);

        System.out.println("List has item? " + hasItem(shoppingList, "apple"));

        // Create a method that removes item based on the index.
        removeItem(shoppingList, 2);

        showListItems(shoppingList);
    }

    //TODO:  Ask a user what index to remove if it is in the list range
    public static void removeItem(ArrayList<String> list) {


    }


    public static void removeItem(ArrayList<String> list, int index) {
        // added 3 items,
        if (index >= 0 && index < list.size()) {
            list.remove(index);
        } else {
            System.out.println(index + " is out of range");
        }
    }


    public static boolean hasItem(ArrayList<String> list, String item) {
        return list.contains(item);
    }

    //TODO:  Ask a user what item to check if it is in the list
    public static boolean hasItem(ArrayList<String> list) {

        return false;
    }


    public static void showListItems(ArrayList<String> list) {

        System.out.println("Shopping List Items: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("\t" + (i + 1) + " " + list.get(i));
        }
    }


    public static void statusOfShoppingList(ArrayList<String> list) {
        if (list.isEmpty()) {
            System.out.println("Shopping List Empty!");
        } else {
            System.out.println("Shopping List has Items!");
        }

        // This is doing the same this as above.
        // System.out.println( list.isEmpty() ? "Shopping List Empty!" :"Shopping List has Items!" );
    }


    public static void askToAddItems(ArrayList<String> list) {
        Scanner input = new Scanner(System.in);
        String userDecision = "";
        do {
            System.out.print("Enter the item: ");
            list.add(input.nextLine());

            System.out.print("Do you want to add more y/n: ");
            userDecision = input.nextLine(); // y, Y,Yes, YES, yEs

        } while (userDecision.equalsIgnoreCase("y") || userDecision.equalsIgnoreCase("yes"));

    }
}
