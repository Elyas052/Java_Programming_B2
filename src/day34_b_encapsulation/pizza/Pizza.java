package day34_b_encapsulation.pizza;

/**
 * create a class called Pizza
 * <p>
 * - data:
 * <p>
 * size (String), number of toppings
 * <p>
 * - constructor
 * <p>
 * - create a constructor that creates a Pizza object with the size and the numberOfToppings
 * <p>
 * call setters here
 * <p>
 * - encapsulate the Pizza class
 * <p>
 * - setter condition:
 * size can only be:
 * small, medium, or large
 * <p>
 * number of toppings must be a positive number
 * <p>
 * - other methods:
 * <p>
 * - calculatePrice()
 *  calculates the price of the pizza based on:
 * <p>
 * small base: $4
 * medium base: $6
 * large base: $8
 * <p>
 * each topping adds $0.75 to the price
 * <p>
 * calculate the total price and return the cost
 * <p>
 * - toString()
 * print the size, number of toppings, and cost of the pizza
 */

public class Pizza {
    private String size;
    private int numberOfToppings;

    public Pizza(String size, int numberOfToppings) {
        setSize(size);
        setNumberOfToppings(numberOfToppings);
    }

    // SETTERS
    public void setSize(String size) {
        if (size.equalsIgnoreCase("large") ||
                size.equalsIgnoreCase("medium") ||
                size.equalsIgnoreCase("small")) {
            this.size = size;
        } else {
            System.out.println("Error: WRONG size");
        }
    }

    public void setNumberOfToppings(int numberOfToppings) {
        if (numberOfToppings >= 0) {
            this.numberOfToppings = numberOfToppings;
        } else {
            System.out.println("Error: WRONG number of toppings");
        }
    }

    //GETTERS
    public String getSize() {
        return size;
    }

    public int getNumberOfToppings() {
        return numberOfToppings;
    }

    public double calculatePrice() {

        double totalPrice;

        if (size.equalsIgnoreCase("small")) {
            totalPrice = 4 + (numberOfToppings * 0.75);
        } else if (size.equalsIgnoreCase("medium")) {
            totalPrice = 6 + (numberOfToppings * 0.75);
        } else if (size.equalsIgnoreCase("large")) {
            totalPrice = 8 + (numberOfToppings * 0.75);
        } else {
            totalPrice = -1;
        }

        return totalPrice;
    }

    @Override
    public String toString() {
        return "Pizza Info" +
                "\n\tSize: " + size +
                "\n\tNumber Of Toppings: " + numberOfToppings +
                "\n\tTotal Price: $" + calculatePrice();
    }
}