package day33_a_static;

public class Food {

    // Instance variables / fields --> name, quantity, unitPrice, totalPrice.
    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

    // Constructors --> ($name)
    public Food(String name) {
        this.name = name;
        calculatePrice();
    }

    // Constructors --> ($name, $quantity)
    public Food(String name, int quantity) {
        this(name);
        this.quantity = quantity;
        calculatePrice();
    }

    // Constructors --> ($name, $quantity, $unitPrice)
    public Food(String name, int quantity, double unitPrice) {
        this(name, quantity);
        this.unitPrice = unitPrice;
        calculatePrice();

    }

    // Method --> calculatePrice ();
    public void calculatePrice() {
        totalPrice = unitPrice * quantity;
    }

    // For print Object directly we crated toString.
    public String toString() {
        return "Info about the Fruit: " +
                "\n\tName: " + name +
                "\n\tQuantity: " + quantity +
                "\n\tUnit Price: $" + unitPrice +
                "\n\tTotal Price: $" + totalPrice;
    }
}