package day34_a_static.computer;

public class Computer {

    // ACCESS MODIFIERS for these 3 fields --> DEFAULT.
    // Default values: brand = null, price = 0.0, color = null
    String brand;

    double price;

    String color;

    // ACCESS MODIFIERS for these 3 static variables --> DEFAULT.
    // Default values: hasScreen = false, hasBattery = false, hasMemory = false
    static boolean hasScreen, hasBattery, hasMemory;

    static {
        System.out.println("Static block run.");
        hasScreen = false;
        hasBattery = true;
        hasMemory = true;
    }

    public Computer(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    /**
     * The following is to explain when o use STATIC or NON-STATIC methods
     */

    // Create a method that prints $brand and $hasMemory info.
    // STATIC accepts only STATIC.
    // Since my task requires me to use INSTANCE variable and STATIC variable,
    // and I know that STATIC accepts only STATIC. So,
    // I need to use NON-STATIC method to be able to have
    // access to instance variables inside that method as well.
    public void test() {
        System.out.println("Brand: " + brand);
        System.out.println("Memory: " + hasMemory);
    }

    public static void test2() {
        //System.out.println("Brand: " + brand);
        System.out.println("Memory: " + hasMemory);
    }
}
