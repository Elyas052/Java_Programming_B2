package day09_a__scanner;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter a product name: ");
        String productName = key.nextLine();

        System.out.print("Enter a price for a " + productName + ": ");
        double price = key.nextDouble();

        System.out.print("How many " + productName + " do you want to buy? ");
        int quantity = key.nextInt();

        key.nextLine(); // I want the ENTER to be handled here.
        System.out.print("What should put on your order name: ");
        String orderName = key.nextLine();

        double totalPrice = price * quantity;

        //"$orderName, your order for $quantity $productName has been placed. Your total is $totalCost(price * quantity)."
        String orderDetail = orderName + ", your order for " + quantity + " " + productName + " has been placed.\nYour total is $" + totalPrice;

        System.out.println(orderDetail);

    }
}
